package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView disp_eqn,disp_res;
    MaterialButton btn_clear,btn_mul,btn_equal,btn_div,btn_sub,btn_add;
    MaterialButton btn_7,btn_8,btn_9,btn_4,btn_5,btn_6,btn_1,btn_2,btn_3,btn_0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        disp_eqn = findViewById(R.id.disp_eqn);
        disp_res = findViewById(R.id.disp_res);

        assignID(btn_7,R.id.btn_seven);
        assignID(btn_8,R.id.btn_eight);
        assignID(btn_9,R.id.btn_nine);
        assignID(btn_clear,R.id.btn_clear);
        assignID(btn_4,R.id.btn_four);
        assignID(btn_5,R.id.btn_five);
        assignID(btn_6,R.id.btn_six);
        assignID(btn_mul,R.id.btn_mul);
        assignID(btn_1,R.id.btn_one);
        assignID(btn_2,R.id.btn_two);
        assignID(btn_3,R.id.btn_three);
        assignID(btn_add,R.id.btn_add);
        assignID(btn_0,R.id.btn_zero);
        assignID(btn_sub,R.id.btn_sub);
        assignID(btn_div,R.id.btn_divide);
        assignID(btn_equal,R.id.btn_equal);
    }
    void assignID(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton Button = (MaterialButton) view;
        String buttonText = Button.getText().toString();
        String dataCalc = disp_eqn.getText().toString();

        if(buttonText.equals("=")){
            disp_eqn.setText(disp_res.getText());
            return;
        }

        if(buttonText.equals("AC")){
            disp_eqn.setText("");
            disp_res.setText("");
            return;
        }
        else{
            dataCalc = dataCalc + buttonText;
        }
        disp_eqn.setText(dataCalc);
        String EndRes = result(dataCalc);
        if(!EndRes.equals("Error")) {
             disp_res.setText(EndRes);
        }
    }
    String result(String data){
        try{
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String EndRes = context.evaluateString(scriptable,data,"JavaScript" ,1,null).toString();
            return EndRes;
        }
        catch (Exception e){
            return "Error";
        }
    }
}

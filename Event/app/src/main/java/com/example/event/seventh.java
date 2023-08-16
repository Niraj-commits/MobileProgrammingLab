package com.example.event;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class seventh extends Activity{
    Button btn;
    TextView TView;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh);
        btn = (Button)findViewById(R.id.btnClick);
        TView = (TextView)findViewById(R.id.txtResult);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TView.setText("Button Has Been Clicked");
            }
        });
    }
}

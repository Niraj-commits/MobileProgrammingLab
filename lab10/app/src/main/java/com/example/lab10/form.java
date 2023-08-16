package com.example.lab10;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.Nullable;

public class form extends Activity {
    Button submitBtn;
    EditText FullName;
    RadioGroup GenderGroup;
    RadioButton Gender;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form);

        submitBtn = (Button)findViewById(R.id.submitBtn);
        FullName = (EditText)findViewById(R.id.fullnameInput);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = FullName.getText().toString();
                int SelectedGenderId = GenderGroup.getCheckedRadioButtonId();
                Gender = (RadioButton) findViewById(SelectedGenderId);
                String gender = Gender.getText().toString();
                Intent report = new Intent(getApplicationContext(), form_receiver.class);
                report.putExtra("FullName", name);
                report.putExtra("Gender", gender);
                startActivity(report);
            }
        });

    }
}
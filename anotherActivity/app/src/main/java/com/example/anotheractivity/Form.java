package com.example.anotheractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;

public class Form extends Activity {
    Button submitBtn;

    EditText firstName, lastName, selectClass, address, roll;
    RadioGroup genderGroup;
    RadioButton genderBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        submitBtn = (Button) findViewById(R.id.submitBtn);
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        selectClass = (EditText) findViewById(R.id.selectClass);
        address = (EditText) findViewById(R.id.address);
        roll = (EditText) findViewById(R.id.roll);
        genderGroup = (RadioGroup) findViewById(R.id.GenderGroup);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = firstName.getText().toString();
                String lastname = lastName.getText().toString();
                int SelectedGenderId = genderGroup.getCheckedRadioButtonId();
                genderBtn = (RadioButton) findViewById(SelectedGenderId);
                String gender = genderBtn.getText().toString();
                String selectclass = selectClass.getText().toString();
                String selectaddress = address.getText().toString();
                String selectroll = roll.getText().toString();
                Intent report = new Intent(getApplicationContext(), Report.class);
                report.putExtra("First Name: ", firstname);
                report.putExtra("Last Name: ", lastname);
                report.putExtra("Class: ", selectclass);
                report.putExtra("Address: ", selectaddress);
                report.putExtra("Gender: ", gender);
                report.putExtra("Roll Number: ", selectroll);
            }
        });





    }
}
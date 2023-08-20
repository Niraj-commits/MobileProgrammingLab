package com.example.internallab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Report extends Activity {
    TextView firstname, lastname, class1, roll, gender, address;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);

        firstname = (TextView) findViewById(R.id.firstNameValue);
        lastname = (TextView) findViewById(R.id.lastNameValue);
        gender = (TextView) findViewById(R.id.genderValue);
        class1 = (TextView) findViewById(R.id.classValue);
        roll = (TextView) findViewById(R.id.rollNumberValue);
        address = (TextView) findViewById(R.id.addressValue);
        Intent form = getIntent();
        String FirstNameValue = getIntent().getStringExtra("First Name");
        String LastNameValue = getIntent().getStringExtra("Last Name");
        String ClassValue = getIntent().getStringExtra("Class");
        String GenderValue = getIntent().getStringExtra("Gender");
        String AddressValue = getIntent().getStringExtra("Address");
        String RollNumberValue = getIntent().getStringExtra("Roll Number");

        firstname.setText(FirstNameValue);
        lastname.setText(LastNameValue);
        class1.setText(ClassValue);
        gender.setText(GenderValue);
        roll.setText(RollNumberValue);
        address.setText(AddressValue);
    }
}

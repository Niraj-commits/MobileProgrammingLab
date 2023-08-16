package com.example.lab6;
import android.app.Activity;
import androidx.annotation.Nullable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class lab6 extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        Spinner spinner = (Spinner) findViewById(R.id.select);

        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.select, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
}

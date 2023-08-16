package com.example.sqliteexam;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class mainActivity extends AppCompatActivity {
    EditText roll,name,address;
    Button insert,view;
    DBHelper db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);

        insert = findViewById(R.id.btnInsert);
        view = findViewById(R.id.btnView);

        db = new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View v) {
                String rollTXT = roll.getText().toString();
                String nameTXT = name.getText().toString();
                String addressTXT = address.getText().toString();

                Boolean insertData = db.insertUserData(rollTXT, nameTXT , addressTXT);
                if(insertData==true)
                    Toast.makeText(mainActivity.this,"New Entry Inserted",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(mainActivity.this,"Entry Not Inserted",Toast.LENGTH_SHORT).show();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = db.getData();
                if(res.getCount()==0) {
                    Toast.makeText(mainActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Roll :" +res.getString(0)+"\n");
                    buffer.append("Name :" +res.getString(1)+"\n");
                    buffer.append("Address :" +res.getString(2)+"\n\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}

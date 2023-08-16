package com.example.lab13;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class main_activity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text = (TextView) findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                text.setText("Setting");
                return true;

            case R.id.share:
                text.setText("Share");
                return true;
            case R.id.history:
                text.setText("History");
                return true;
            case R.id.help:
                text.setText("Help");
                return true;
            case R.id.logout:
                text.setText("Logout");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

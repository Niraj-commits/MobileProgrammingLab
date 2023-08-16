package com.example.gridview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class main_activity extends AppCompatActivity {
    GridView gridView;
    TextView textView;
    String[] carBrands = {
            "Ferrari",
            "McLaren",
            "Jaguar",
            "Skoda",
            "Suzuki",
            "Hyundai",
            "Toyota",
            "Renault",
            "Mercedes",
            "BMW",
            "Ford",
            "Honda",
            "Chevrolet",
            "Volkswagon",
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        gridView = (GridView) findViewById(R.id.gridView);
        textView = (TextView) findViewById(R.id.textView);

        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.grid_item,carBrands)
    }
}

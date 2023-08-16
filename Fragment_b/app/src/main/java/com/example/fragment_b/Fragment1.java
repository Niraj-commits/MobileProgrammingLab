package com.example.fragment_b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    EditText firstBtn,secondBtn;
    Button calculateBtn;
    TextView txtResult;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);

        firstBtn = view.findViewById(R.id.firstNum);
        secondBtn = view.findViewById(R.id.secondNum);
        calculateBtn = view.findViewById(R.id.calculateBtn);
        txtResult = view.findViewById(R.id.result);

        calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int first,second,result;
                first = Integer.parseInt(firstBtn.getText().toString());
                second = Integer.parseInt(secondBtn.getText().toString());
                result = first+second;
                txtResult.setText("Result = " +result);
            }
        });
        return view;
    }
}

package com.example.c_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view){
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtDob = findViewById(R.id.edtTxtDob);
        TextView txtInfo = findViewById(R.id.txtInfo);
        txtInfo.setText("Hi, " + edtTxtName.getText().toString() + ". Your date of birth is " + edtTxtDob.getText().toString());
    }
}
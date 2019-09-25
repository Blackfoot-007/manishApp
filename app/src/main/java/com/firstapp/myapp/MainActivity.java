package com.firstapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText etFirst, etSecond;
private Button btnSum, btnSub;
int first,second,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst=findViewById(R.id.etFirst);
        etSecond=findViewById(R.id.etSecond);
        btnSum=findViewById(R.id.btnSum);
        btnSub=findViewById(R.id.btnSub);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(etFirst.getText().toString());
                second=Integer.parseInt(etSecond.getText().toString());
                result=first+second;
                Toast.makeText(MainActivity.this, "The Sum is "+ result, Toast.LENGTH_SHORT).show();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(etFirst.getText().toString());
                second=Integer.parseInt(etSecond.getText().toString());
                result=first-second;
                Toast.makeText(MainActivity.this, "The Sub is "+ result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

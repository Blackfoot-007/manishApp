package com.firstapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAdd, btnTemp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAdd = findViewById(R.id.btnAdd);
        btnTemp = findViewById(R.id.btnTemp);

        btnAdd.setOnClickListener(this);
        btnTemp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAdd) {
            Intent intent = new Intent(DashBoardActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btnTemp) {
            Intent intense = new Intent(DashBoardActivity.this, TemperatureActivity.class);
            startActivity(intense);
        }
    }

}


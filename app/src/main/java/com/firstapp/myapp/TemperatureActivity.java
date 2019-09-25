package com.firstapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TemperatureActivity extends AppCompatActivity {
    private EditText  etCelsius;
    private Button btnFahrenheit,btnCelsius;
    Double Degree, Fahrenheit, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        etCelsius = findViewById(R.id.etCelsius);

        btnFahrenheit = findViewById(R.id.btnFahrenheit);
        btnCelsius = findViewById(R.id.btnCelsius);

        btnFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Degree = Double.parseDouble(etCelsius.getText().toString());
                result = (9 / 5.0 * Degree) + 32;
                Toast.makeText(TemperatureActivity.this, "The Fahrenheit is " + result, Toast.LENGTH_SHORT).show();
            }
        });
        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fahrenheit=Double.parseDouble(etCelsius.getText().toString());
                result=(Fahrenheit-32)/1.8;
                Toast.makeText(TemperatureActivity.this, "The Celsius is " + result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

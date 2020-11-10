package com.example.segunda_evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalculadora, btnDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnDatos = findViewById(R.id.btnDatos);

        btnCalculadora.setOnClickListener(this);
        btnDatos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalculadora:{
                Intent i = new Intent(this, Calculadora.class);
                startActivity(i);
            }break;
            case R.id.btnDatos:{
                Intent i = new Intent(this, Datos.class);
                startActivity(i);
            }break;

        }
    }
}
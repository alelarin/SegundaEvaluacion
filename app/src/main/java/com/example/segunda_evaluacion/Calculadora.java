package com.example.segunda_evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    Button btnAC, btnDEL, btnMas, btnMenos, btnPor, btnDivision, btnIgual, btnParentesisD, btnParentesisI, btnPunto, btnCero;
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve;
    TextView txtResultado, txtDown;
    double resultado;
    String operador, mostrar , reserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(R.string.codigo);

        //inicializamos los controles
        btnAC = findViewById(R.id.btnAC);
        btnDEL = findViewById(R.id.btnDEL);
        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnPor = findViewById(R.id.btnPor);
        btnDivision = findViewById(R.id.btnDivision);
        btnIgual = findViewById(R.id.btnIgual);
        btnCero = findViewById(R.id.btnCero);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
        txtResultado = findViewById(R.id.txtUp);

        //enlazamos los controles al evento click

        btnAC.setOnClickListener(this);
        btnDEL.setOnClickListener(this);
        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnPor.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnCero.setOnClickListener(this);
        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
        btnNueve.setOnClickListener(this);
        //evaluamos si la pantalla es landscape
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            //inicializamos controles
            btnParentesisD = findViewById(R.id.btnParentesisD);
            btnParentesisI = findViewById(R.id.btnParentesisI);
            btnPunto = findViewById(R.id.btnPunto);

            btnPunto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + ".";
                    txtResultado.setText(mostrar);
                }
            });

            btnParentesisD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    reserva = txtResultado.getText().toString();
                    operador = "(";
                    txtResultado.setText("");
                }
            });

            btnParentesisI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    reserva = txtResultado.getText().toString();
                    operador = ")";
                    txtResultado.setText("");
                }
            });



        }
    }

    @Override
    public void onClick(View view) {
            switch(view.getId()){
                case R.id.btnCero:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "0";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnUno:{
                mostrar = txtResultado.getText().toString();
                mostrar = mostrar + "1";
                txtResultado.setText(mostrar);
                }break;
                case R.id.btnDos:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "2";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnTres:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "3";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnCuatro:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "4";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnCinco:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "5";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnSeis:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "6";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnSiete:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "7";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnOcho:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "8";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnNueve:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "9";
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnMas:{
                    reserva = txtResultado.getText().toString();
                    operador = "+";
                    txtResultado.setText("");
                }break;
                case R.id.btnMenos:{
                    reserva = txtResultado.getText().toString();
                    operador = "-";
                    txtResultado.setText("");
                }break;
                case R.id.btnPor:{
                    reserva = txtResultado.getText().toString();
                    operador = "*";
                    txtResultado.setText("");
                }break;
                case R.id.btnDivision:{
                    reserva = txtResultado.getText().toString();
                    operador = "/";
                    txtResultado.setText("");
                }break;
                case R.id.btnAC:{
                    mostrar = "";
                    txtResultado.setText(mostrar);
                    reserva = "";
                    operador = "";
                }break;
                case R.id.btnDEL:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar.substring(0,mostrar.length()-1);
                    txtResultado.setText(mostrar);
                }break;
                case R.id.btnIgual:{
                    mostrar = txtResultado.getText().toString();
                    mostrar = mostrar + "1";
                    if(operador.equals("-")){
                        resultado = Double.parseDouble(reserva) - Double.parseDouble(txtResultado.getText().toString());
                        txtResultado.setText(String.valueOf(resultado));
                    }
                    if(operador.equals("+")){
                        resultado = Double.parseDouble(reserva) + Double.parseDouble(txtResultado.getText().toString());
                        txtResultado.setText(String.valueOf(resultado));
                    }
                    if(operador.equals("/")){
                        resultado = Double.parseDouble(reserva) / Double.parseDouble(txtResultado.getText().toString());
                        txtResultado.setText(String.valueOf(resultado));
                    }
                    if(operador.equals("*")){
                        resultado = Double.parseDouble(reserva) * Double.parseDouble(txtResultado.getText().toString());
                        txtResultado.setText(String.valueOf(resultado));
                    }
                }break;
            }
    }
}
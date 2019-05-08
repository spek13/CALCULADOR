package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        pantalla = (TextView) findViewById(R.id.pantalla);

    }

    public void calcular(View vista){
        String operador = "";
        Button btn = (Button) vista;//objet buton
        //pantalla.setText(n1.getText().toString());//mostrar el valores en la pantalla, obtenido de un EditTex
        //n2.setText(btn.getText().toString());//obtener el texto del boton

            operador = btn.getText().toString();//obtener el operador
        //pantalla.setText(operador);//mostrar el valores en la pantalla
        switch(operador){
            case "+":
                double suma;
                    suma =  Double.parseDouble(n1.getText().toString()) + Double.parseDouble(n2.getText().toString()) ;
                    pantalla.setText(String.valueOf(suma));//mostrar el valores en la pantalla, obtenido de un EditTex

                break;

            case "-":
                double resta;
                resta =  Double.parseDouble(n1.getText().toString()) - Double.parseDouble(n2.getText().toString()) ;
                pantalla.setText(String.valueOf(resta));//mostrar el valores en la pantalla, obtenido de un EditTex

             break;

            case "*":
                double multiplicacion;
                multiplicacion =  Double.parseDouble(n1.getText().toString()) * Double.parseDouble(n2.getText().toString()) ;
                pantalla.setText(String.valueOf(multiplicacion));//mostrar el valores en la pantalla, obtenido de un EditTex

            break;

            case "/":
                double division;
                division =  Double.parseDouble(n1.getText().toString()) / Double.parseDouble(n2.getText().toString()) ;
                pantalla.setText(String.valueOf(division));//mostrar el valores en la pantalla, obtenido de un EditTex

            break;

            case "^":
                double exp;
                exp =  Math.pow(Double.parseDouble(n1.getText().toString()), Double.parseDouble(n2.getText().toString()))  ;
                pantalla.setText(String.valueOf(exp));//mostrar el valores en la pantalla, obtenido de un EditTex

                break;

            case "%":
                double por;
                por = Double.parseDouble(n1.getText().toString()) * (Double.parseDouble(n2.getText().toString()) / 100) ;
                pantalla.setText(String.valueOf(por));//mostrar el valores en la pantalla, obtenido de un EditTex

                break;
        }

    }

}

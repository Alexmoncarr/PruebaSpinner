package com.example.pruebaspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button BtnCalcular;
    EditText edit1, edit2;

    TextView Txt3;
    Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnCalcular = (Button) findViewById(R.id.BtnCalcular);
        spinner = (Spinner) findViewById(R.id.spinner);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        Txt3 = (TextView) findViewById(R.id.Txt3);

        String [] operaciones={ "Sumar", "Restar", "Multiplicar", "Dividir"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operaciones);

        spinner.setAdapter(adapter);




    }

    public void Calcular(View view){

        String valor1_String = edit1.getText().toString();

        String valor2_String = edit2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);

        int valor2_int = Integer.parseInt(valor2_String);

        String seleccion = spinner.getSelectedItem().toString();

        if(seleccion.equals("Sumar")){

            int suma = valor1_int + valor2_int;

            String resultado = String.valueOf(suma);

            Txt3.setText(resultado);

        } else if(seleccion.equals("Restar")){

            int resta = valor1_int - valor2_int;

            String resultado = String.valueOf(resta);

            Txt3.setText(resultado);

        } else if(seleccion.equals("Multiplicar")) {

            int multi = valor1_int * valor2_int;

            String resultado = String.valueOf(multi);

            Txt3.setText(resultado);

        } else if(seleccion.equals("Dividir")){

            if(valor2_int != 0){

                int div = valor1_int / valor2_int;

                String resultado = String.valueOf(div);

                Txt3.setText(resultado);

            } else {

                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();

            }

        }

    }
}
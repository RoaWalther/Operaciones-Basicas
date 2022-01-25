package com.example.walter.myradiobottonwalther;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView vt;
    private RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText)findViewById(R.id.txt_nun1);
        et2 = (EditText)findViewById(R.id.txt_nun2);
        vt = (TextView)findViewById(R.id.tv_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb2 = (RadioButton)findViewById(R.id.rb_resta);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicacion);
        rb4 = (RadioButton)findViewById(R.id.rb_dividir);
    }

    public void resul (View view){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int valo1 = Integer.parseInt(valor1);
        int valo2 = Integer.parseInt(valor2);

        if (rb1.isChecked() == true){

            int suma = valo1 + valo2;
            String resultado = String.valueOf(suma);
            vt.setText(resultado);
        }else if (rb2.isChecked() == true) {

            int resta = valo1 - valo2;
            String resultado = String.valueOf(resta);
            vt.setText(resultado);
        }else if (rb3.isChecked() == true) {

            int multi = valo1 * valo2;
            String resultado = String.valueOf(multi);
            vt.setText(resultado);
        }else if (rb4.isChecked() == true){

            if (valo2 != 0){
            double dividir = valo1 / valo2;
            String resultado = String.valueOf(dividir);
            vt.setText(resultado);
            } else {
                Toast.makeText(this,"el segundo valor debe ser diferente a cero",Toast.LENGTH_SHORT).show();
            }
        }
    }
       }

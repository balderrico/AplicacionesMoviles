package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pant;
    private double op1, op2, resultado;
    int id;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pant=(EditText)findViewById(R.id.pantalla);

    }

    public void btn1(View view){
        String captura=pant.getText().toString();
        captura = captura+"1";
        pant.setText(captura);
    }

    public void btn2(View view){
        String captura=pant.getText().toString();
        captura = captura+"2";
        pant.setText(captura);
    }

    public void btn3(View view){
        String captura=pant.getText().toString();
        captura = captura+"3";
        pant.setText(captura);
    }

    public void btn4(View view){
        String captura=pant.getText().toString();
        captura = captura+"4";
        pant.setText(captura);
    }

    public void btn5(View view){
        String captura=pant.getText().toString();
        captura = captura+"5";
        pant.setText(captura);
    }

    public void btn6(View view){
        String captura=pant.getText().toString();
        captura = captura+"6";
        pant.setText(captura);
    }

    public void btn7(View view){
        String captura=pant.getText().toString();
        captura = captura+"7";
        pant.setText(captura);
    }

    public void btn8(View view){
        String captura=pant.getText().toString();
        captura = captura+"8";
        pant.setText(captura);
    }

    public void btn9(View view){
        String captura=pant.getText().toString();
        captura = captura+"9";
        pant.setText(captura);
    }

    public void btn0(View view){
        String captura=pant.getText().toString();
        captura = captura+"0";
        pant.setText(captura);
    }

    public void btnPunto(View view){
        String captura=pant.getText().toString();
        captura = captura+".";
        pant.setText(captura);
    }

    public void suma(View v){
        try {
            String s1 = pant.getText().toString();
            op1 = Double.parseDouble(s1);
        }catch(NumberFormatException n){}
        pant.setText("");
        id=1;
    }

    public void resta(View v){
        try {
            String s1 = pant.getText().toString();
            op1 = Double.parseDouble(s1);
        }catch(NumberFormatException n){}
        pant.setText("");
        id=2;
    }

    public void multiplicacion(View v){
        try {
            String s1 = pant.getText().toString();
            op1 = Double.parseDouble(s1);
        }catch(NumberFormatException n){}
        pant.setText("");
        id=3;
    }

    public void division(View v){
        try {
            String s1 = pant.getText().toString();
            op1 = Double.parseDouble(s1);
        }catch(NumberFormatException n){}
        pant.setText("");
        id=4;
    }

    public void igual(View v){
        try {
            String s2 = pant.getText().toString();
            op2 = Double.parseDouble(s2);
        }catch(NumberFormatException n){}
        pant.setText("");

        if(id==1){
            resultado=op1+op2;
        }else
            if(id==2){
                resultado=op1-op2;
            }
         else
             if(id==3){
                 resultado=op1*op2;
             }
         else
             if(id==4){
                 if(op2==0) {
                     pant.setText("Error");
                 }else{
                     resultado=op1/op2;
                 }
             }
             pant.setText(""+resultado);
             op1=resultado;
    }

    public void limpiar(View v){
        pant.setText("");
        op1=0.0;
        op2=0.0;
        resultado=0.0;
    }
}

package com.example.abrirotroactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SegundoActivity extends AppCompatActivity {


    private EditText pantalla;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        pantalla = (EditText)findViewById(R.id.campo);

        final EditText textoexportar;
        textoexportar=(EditText)findViewById(R.id.campo);

        Button btn2 = (Button) findViewById(R.id.boton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent2, 0);


            }
        });

        Button btn = (Button) findViewById(R.id.boton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity.class);

                intent.putExtra("Ejemplo", textoexportar.getText().toString());

                startActivityForResult(intent, 0);
            }
        });



    }




}

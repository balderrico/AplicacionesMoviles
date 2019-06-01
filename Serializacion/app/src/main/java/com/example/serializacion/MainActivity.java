package com.example.serializacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);

        Button b = (Button)  findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent describe la actividad que se va a iniciar
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                String nombre = e1.getText().toString();
                String apellido = e2.getText().toString();

                Estudiante e = new Estudiante(nombre,apellido);
                i.putExtra("object",e);
                startActivity(i);

            }
        });
    }
}

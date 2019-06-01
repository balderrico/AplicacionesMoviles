package com.example.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Persona>lista_persona;
    private EditText edit_busqueda;
    private TextView txt_personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edit_busqueda= (EditText)findViewById(R.id.editText);
    }
}

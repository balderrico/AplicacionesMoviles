package com.example.serializacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);


        Intent i = getIntent();
        Bundle b=i.getExtras();
        Estudiante e = (Estudiante) b.getSerializable("object");

        t1.setText(e.getNombre());
        t2.setText(e.getApellido());
    }
}

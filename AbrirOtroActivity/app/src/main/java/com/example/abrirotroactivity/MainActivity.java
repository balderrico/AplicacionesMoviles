package com.example.abrirotroactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        String fraseimportada=bundle.getString("Ejemplo");


        String textoPasado = fraseimportada;
        TextView out = (TextView)findViewById(R.id.tabla);
        out.setText(textoPasado);

        Button btn = (Button) findViewById(R.id.boton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), SegundoActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}

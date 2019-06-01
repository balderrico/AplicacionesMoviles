package com.example.geolocalizacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_longitud,txt_latitud;
    private Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_latitud = (TextView) findViewById(R.id.txt_latitud);
        txt_longitud = (TextView) findViewById(R.id.txt_longitud);

        update = (Button) findViewById(R.id.update_location);


    }

    public void getLocalitation(View view){


    }
}

package com.example.laravel2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final String BASEURL = "http://0.0.0.0:8000/libro";
    private RequestQueue requestQueue;
    private Context ctx;
    private StringRequest strq;
    private EditText nombre,resumen,no_pag,edicion,autor,precio;
    private Button crear,eliminar,seleccionar,actualizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx = this;
        requestQueue = Volley.newRequestQueue(ctx);

        nombre = (EditText) findViewById(R.id.txt_nombre);
        resumen = (EditText) findViewById(R.id.txt_res);
        no_pag = (EditText) findViewById(R.id.txt_nopag);
        edicion = (EditText) findViewById(R.id.txt_ed);
        autor = (EditText) findViewById(R.id.txt_aut);
        precio = (EditText) findViewById(R.id.txt_prec);

        crear = (Button)findViewById(R.id.btn_crear);
        eliminar = (Button)findViewById(R.id.btn_elim);
        seleccionar = (Button)findViewById(R.id.btn_selec);
        actualizar = (Button)findViewById(R.id.btn_act);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crear();
            }
        });
        actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizar();
            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eliminar();
            }
        });
        seleccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }
        });

    }

    private void crear() {

        strq = new StringRequest(Request.Method.POST, BASEURL+"/create",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("rta_servidor", response);
                        Toast.makeText(ctx, response, Toast.LENGTH_LONG).show();
                    }
                },  new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error_servidor", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams()  {
                Map<String, String> parametros = new HashMap<>();

                parametros.put("nombre", nombre.getText().toString());

                return parametros;
            }
        };

        requestQueue.add(strq);

    }

    private void actualizar() {

        strq = new StringRequest(Request.Method.POST, BASEURL+"/edit"+nombre.getText().toString(),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("rta_servidor", response);
                        Toast.makeText(ctx, response, Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error_servidor", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams()  {
                Map<String, String> parametros = new HashMap<>();

                parametros.put("nombre", nombre.getText().toString());

                return parametros;
            }
        };

        requestQueue.add(strq);

    }

    private void eliminar() {

        strq = new StringRequest(Request.Method.DELETE, BASEURL+nombre.getText().toString(),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("rta_servidor", response);
                        Toast.makeText(ctx, response, Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error_servidor", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams()  {
                Map<String, String> parametros = new HashMap<>();

                parametros.put("nombre", nombre.getText().toString());
                return parametros;
            }
        };

        requestQueue.add(strq);
    }

    private void show() {

        strq = new StringRequest(Request.Method.GET, BASEURL+nombre.getText().toString(),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("rta_servidor", response);
                        Toast.makeText(ctx, response, Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error_servidor", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams()  {
                Map<String, String> parametros = new HashMap<>();

                parametros.put("nombre", nombre.getText().toString());
                return parametros;
            }
        };

        requestQueue.add(strq);
    }



    }


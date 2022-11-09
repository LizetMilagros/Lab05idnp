package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class PostulanteregistroActivity extends AppCompatActivity {

    private static String TAG = "PostulanteregistroActivity";
    EditText edtPaterno;
    EditText edtMaterno;
    EditText edtNombres;
    EditText edtDni;
    EditText edtFecha;
    EditText edtColegio;
    EditText edtCarrera;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulanteregistro);

        Postulante postulante = new Postulante();
        edtPaterno = findViewById(R.id.edtPaterno);
        edtMaterno = findViewById(R.id.edtMaterno);
        edtNombres = findViewById(R.id.edtNombres);
        edtDni = findViewById(R.id.edtDNI);
        edtFecha = findViewById(R.id.edtFecha);
        edtColegio = findViewById(R.id.edtColegio);
        edtCarrera = findViewById(R.id.edtCarrera);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postulante.setApePaterno(edtPaterno.getText().toString());
                postulante.setApeMaterno(edtMaterno.getText().toString());
                postulante.setNombres(edtNombres.getText().toString());
                postulante.setDni(edtDni.getText().toString());
                postulante.setFecha(edtFecha.getText().toString());
                postulante.setColegio(edtColegio.getText().toString());
                postulante.setCarrera(edtCarrera.getText().toString());

                Bundle args = new Bundle();
                args.putSerializable("postulante",  postulante);
                Intent i = new Intent(); //ENVIAR MENSAJE ENTRE APLICACIONES O ACTIVITYS
                i.putExtra("bundle",args);
                setResult(1, i); //Si el registro fue satisfactorio
                finish();

            }
        });

    }
}
package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class PostulanteregistroActivity extends AppCompatActivity {

    private static String TAG = "PostulanteregistroActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulanteregistro);

        List<Postulante> postulantes = new ArrayList<Postulante>();

        EditText edtPaterno = findViewById(R.id.edtPaterno);
        EditText edtMaterno = findViewById(R.id.edtMaterno);
        EditText edtNombres = findViewById(R.id.edtNombres);
        EditText edtDni = findViewById(R.id.edtDNI);
        EditText edtFecha = findViewById(R.id.edtFecha);
        EditText edtColegio = findViewById(R.id.edtColegio);
        EditText edtCarrera = findViewById(R.id.edtCarrera);
        TextView txtMensaje = findViewById(R.id.txtMensaje);
        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        Button btnListar = findViewById(R.id.btnListar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String apePaterno = edtPaterno.getText().toString();
                String apeMaterno = edtMaterno.getText().toString();
                String nombres = edtNombres.getText().toString();
                String dni = edtDni.getText().toString();
                String fecha = edtFecha.getText().toString();
                String colegio = edtColegio.getText().toString();
                String carrera = edtCarrera.getText().toString();
                if(!apePaterno.equals("") && !apeMaterno.equals("") && !nombres.equals("") && !dni.equals("") && !fecha.equals("") && !colegio.equals("") && !carrera.equals("")) {
                    Postulante postulante = new Postulante(apePaterno, apeMaterno, nombres, dni, fecha, colegio, carrera);
                    postulantes.add(postulante);
                    Log.d(TAG, "Postulante: "+apePaterno+", "+apeMaterno+", "+nombres+","+dni+","+fecha+", "+colegio+", "+carrera);
                    txtMensaje.setText("Postulante registrado");
                }
                else {
                    Log.d(TAG, "Complete los datos faltantes");
                    txtMensaje.setText("Datos incompletos");
                }
                /*Intent i = new Intent(PostulanteregistroActivity.this, MenuActivity.class );
                Postulante p = new Postulante(apePaterno, apeMaterno,nombres,dni,fecha,colegio,carrera );
                i.putExtra("p", p);
                startActivity(i);*/
            }
        });

       btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Iterator iter = postulantes.iterator();
                int nro=1;
                while(iter.hasNext()){
                    Log.d(TAG, "\nPostulante " + nro + iter.next());
                    nro++;
                }
            }
        });


    }
}
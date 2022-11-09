package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PostulanteinfActivity extends AppCompatActivity {

    private static final String TAG = "PostulanteinfActivity";
    private ArrayList<Postulante> postulantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulanteinf);

        TextView paterno = findViewById(R.id.txtPaterno);
        TextView materno = findViewById(R.id.txtMaterno);
        TextView nombre = findViewById(R.id.txtNombre);
        TextView dni = findViewById(R.id.txtDni);
        TextView nacimiento = findViewById(R.id.txtNacimiento);
        TextView colegio = findViewById(R.id.txtColegio);
        TextView carrera = findViewById(R.id.txtCarrera);

        Button btnBuscar = findViewById(R.id.btnBuscar);
        EditText edtBuscar = findViewById(R.id.editTextBuscar);

        Intent i = getIntent(); //recupero el intent y el arrraylist con los datos ingresados

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String codigo = edtBuscar.getText().toString();
                Bundle args = i.getBundleExtra("BUNDLE");
                postulantes=(ArrayList<Postulante>) args.getSerializable("list");
                for (Postulante post : postulantes){
                    if(codigo.equals(post.getDni())){

                        String pat= i.getStringExtra(post.getApePaterno());
                        String mat= i.getStringExtra(post.getApeMaterno());
                        String nomb = i.getStringExtra(post.getNombres());
                        String dni1= i.getStringExtra(post.getDni());
                        String fecha= i.getStringExtra(post.getFecha());
                        String col = i.getStringExtra(post.getColegio());
                        String carr= i.getStringExtra(post.getCarrera());

                        paterno.setText(pat);
                        materno.setText(mat);
                        nombre.setText(nomb);
                        dni.setText(dni1);
                        nacimiento.setText(fecha);
                        colegio.setText(col);
                        carrera.setText(carr);
                    }
                    else{
                        Toast.makeText(PostulanteinfActivity.this, "Error: (",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
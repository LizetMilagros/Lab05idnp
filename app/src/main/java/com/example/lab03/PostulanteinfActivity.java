package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PostulanteinfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulanteinf);

        /*EditText editTextBuscar = findViewById(R.id.editTextBuscar);
        Button btnBuscar = findViewById(R.id.btnBuscar);

        Intent i = getIntent();
        Postulante p = i.getParcelableExtra("p");

        editTextBuscar.setText(p.getNombres());*/
    }
}
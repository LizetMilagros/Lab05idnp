package com.example.lab03;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private ArrayList<Postulante> postulantes = new ArrayList<Postulante>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        fondo();
        postulantes = new ArrayList<>();
        Button btnInfPostulante = findViewById(R.id.btnPostulante);
        Button btnNuevo = findViewById(R.id.btnNuevo);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, PostulanteregistroActivity.class);
                startForResult.launch(intent);
            }
        });
        btnInfPostulante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PostulanteinfActivity.class);
                Bundle args = new Bundle();
                args.putSerializable("list", postulantes);
                intent.putExtra("BUNDLE", args);
                startActivity(intent);
            }
        });
    }

    ActivityResultLauncher<Intent> startForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) { //recuperar o llamar el activity registro
            if(result.getResultCode() == Activity.RESULT_OK){
                Intent intent =result.getData();
                Bundle args= intent.getBundleExtra("bundle");
                postulantes.add((Postulante) args.getSerializable("postulante"));
            }
        }
    });
    public void fondo(){
        ConstraintLayout constraintLayout=findViewById(R.id.mainLayout);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
    }
}
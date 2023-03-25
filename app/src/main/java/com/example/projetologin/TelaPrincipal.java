package com.example.projetologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity implements View.OnClickListener {

    Button btcheck, btlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        btcheck = (Button) findViewById(R.id.btcheck);
        btlista = (Button) findViewById(R.id.btlista);

        btcheck.setOnClickListener(this);
        btlista.setOnClickListener(this);

        getSupportActionBar().hide();
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btcheck) {
            Intent check = new Intent(this,checklist.class);
            startActivity(check);
        }
        if (view.getId()==R.id.btlista){
            Intent check = new Intent(this,lista.class);
            startActivity(check);
        }

    }
}
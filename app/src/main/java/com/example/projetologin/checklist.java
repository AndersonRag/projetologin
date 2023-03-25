package com.example.projetologin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class checklist extends AppCompatActivity implements View.OnClickListener {
    Button btfinalizadocheck;

    CheckBox tarefLimpar, tarefComida, tarefLicao, tarefEstudar, tarefCachorro, tarefLixo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        btfinalizadocheck = (Button) findViewById(R.id.btfinalizadocheck);
        tarefLimpar = (CheckBox) findViewById(R.id.tarefLimpar);
        tarefComida = (CheckBox) findViewById(R.id.tarefComida);
        tarefLicao = (CheckBox) findViewById(R.id.tarefLicao);
        tarefEstudar = (CheckBox) findViewById(R.id.tarefEstudar);
        tarefCachorro = (CheckBox) findViewById(R.id.tarefCachorro);
        tarefLixo = (CheckBox) findViewById(R.id.tarefLixo);
        btfinalizadocheck.setOnClickListener(this);

        getSupportActionBar().hide();
    }

    @Override
    public void onClick(View view) {
        String msg = "Finalizado";
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setMessage(msg);
        dialogo.setTitle("Atenção");
        dialogo.setNeutralButton("Ok",null);
        dialogo.show();
    }
}
package com.example.projetologin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormCadastro extends AppCompatActivity implements View.OnClickListener{

    androidx.appcompat.widget.AppCompatButton bt_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        bt_cadastrar = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.bt_cadastar);
        bt_cadastrar.setOnClickListener(this);

        getSupportActionBar().hide();


    }

    @Override
    public void onClick(View view) {
        String msg = "Cadastrado Realizado!";
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setMessage(msg);
        dialogo.setTitle("Cadastro");
        dialogo.setNeutralButton("Ok",null);
        dialogo.show();

    }
}
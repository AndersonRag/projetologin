package com.example.projetologin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class lista extends AppCompatActivity implements View.OnClickListener {
    Button btfinalizadolista;

    CheckBox compArroz, compFeijao, compOleo, compManteiga, compLeite, compCarne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        btfinalizadolista = (Button) findViewById(R.id.btfinalizadolista);
        compArroz = (CheckBox) findViewById(R.id.compArroz);
        compFeijao = (CheckBox) findViewById(R.id.compFeijao);
        compOleo = (CheckBox) findViewById(R.id.compOleo);
        compManteiga = (CheckBox) findViewById(R.id.compManteiga);
        compLeite = (CheckBox) findViewById(R.id.compLeite);
        compCarne = (CheckBox) findViewById(R.id.compCarne);
        btfinalizadolista.setOnClickListener(this);

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
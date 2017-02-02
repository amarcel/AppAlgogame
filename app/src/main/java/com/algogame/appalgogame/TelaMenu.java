package com.algogame.appalgogame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class TelaMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        //abrir a Intent passada da TelaInicial:
        Intent j = getIntent();
        String nomeJogador = j.getStringExtra("nomeJogador");

        //mostrando um alerta
        Toast.makeText(this,
                "Nome digitado: " + nomeJogador,
                Toast.LENGTH_SHORT).show();
    }
}

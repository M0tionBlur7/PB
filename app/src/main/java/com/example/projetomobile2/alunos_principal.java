package com.example.projetomobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class alunos_principal extends AppCompatActivity {

    private ImageView voltar;
    private FloatingActionButton addAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunos_principal);

        voltar = findViewById(R.id.voltarMenu);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(voltarMenu);
            }
        });

        addAluno = findViewById(R.id.addAlunos);
        addAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaAddAlunos = new Intent(getApplicationContext(), alunos_cad.class);
                finish();
                startActivity(telaAddAlunos);
            }
        });

    }
}
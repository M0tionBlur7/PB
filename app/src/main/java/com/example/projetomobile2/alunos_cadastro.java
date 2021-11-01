package com.example.projetomobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class alunos_cadastro extends AppCompatActivity {

    private ImageView voltarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunos_cadastro);

        voltarMenu = findViewById(R.id.voltarPrincipal);
        voltarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarPrincipal = new Intent(getApplicationContext(), alunos_principal.class);
                finish();
                startActivity(voltarPrincipal);
            }
        });

    }
}
package com.example.projetomobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class info extends AppCompatActivity {

    private ImageView volta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        volta.findViewById(R.id.voltar);
        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarTela = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(voltarTela);
            }
        });

    }
}
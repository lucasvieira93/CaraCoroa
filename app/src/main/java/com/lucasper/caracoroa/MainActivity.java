package com.lucasper.caracoroa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar, botaoLogo;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.botaoJogarId);
        botaoLogo = findViewById(R.id.logoId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int aleatorio = randomico.nextInt(2); //0 ou 1 da array

                Intent intent = new Intent(MainActivity.this, MoedaActivity.class);
                intent.putExtra("opcao", opcao[aleatorio]);

                startActivity(intent);
            }
        });
    }


   /*@Override
    public void onClick(View v) {
        if (v.getId() == R.id.botaoJogarId){
            Random randomico = new Random();
            int aleatorio = randomico.nextInt(2); //0 ou 1 da array

            Intent intent = new Intent(MainActivity.this, MoedaActivity.class);
            intent.putExtra("opção", opcao[aleatorio]);

            startActivity(intent);
        }
    } */
}

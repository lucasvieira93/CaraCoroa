package com.lucasper.caracoroa;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MoedaActivity extends AppCompatActivity {

    private ImageView botaoVoltar, imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda);

        imagem = findViewById(R.id.moedaId);
        botaoVoltar = findViewById(R.id.botaoVoltarId);

        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if (opcaoEscolhida.equals("cara")){
                imagem.setImageDrawable(ContextCompat.getDrawable(MoedaActivity.this, R.drawable.moeda_cara));
            } else {
                imagem.setImageDrawable(ContextCompat.getDrawable(MoedaActivity.this, R.drawable.moeda_coroa));
            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //simplesmente encerra a intent ao invés de transferir dados como a linha abaixo:
                // startActivity(new Intent(MoedaActivity.this, MainActivity.class));

            }
        });
    }
}

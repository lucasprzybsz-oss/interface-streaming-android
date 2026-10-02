package com.example.atividaderecyclerview;
import com.bumptech.glide.Glide;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetalhesFilmesActivity extends AppCompatActivity {

    ImageView imagem_filme, logo_filme;

    TextView titulo_filme, genero_ano_filme, descricao_filme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalhes_filmes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //recebe o objeto enviado pelo intent
        Filme filme = (Filme) getIntent()
                .getSerializableExtra("filme");

        genero_ano_filme = findViewById(R.id.genero_ano_filme);
        descricao_filme = findViewById(R.id.descricao_filme);
        imagem_filme = findViewById(R.id.imagem_filme);
        titulo_filme = findViewById(R.id.titulo_filme);
        logo_filme = findViewById(R.id.logo_filme);


        //prepara todos os campos com as informações do objeto
        genero_ano_filme.setText(filme.getGenero() + " • " + filme.getAno());

        descricao_filme.setText(filme.getDescricao());

        titulo_filme.setText(filme.getTitulo());

        logo_filme.setImageResource(filme.getLogo());

        // Carrega a imagem url
        Glide.with(this)
                .load(filme.getImagem())
                .into(imagem_filme);
    }
}
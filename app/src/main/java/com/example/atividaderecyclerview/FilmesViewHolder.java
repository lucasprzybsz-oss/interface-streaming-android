package com.example.atividaderecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmesViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageFilme;
    public TextView tituloFilme;
    public TextView descricaoFilme;
    public TextView generoAno;

    //define a referencia de cada item do view
    public FilmesViewHolder(@NonNull View itemView) {
        super(itemView);
        imageFilme = itemView.findViewById(R.id.imagem_filme);
        tituloFilme = itemView.findViewById(R.id.titulo_filme);
        descricaoFilme = itemView.findViewById(R.id.descricao_filme);
        generoAno = itemView.findViewById(R.id.genero_ano_filme);
    }
}

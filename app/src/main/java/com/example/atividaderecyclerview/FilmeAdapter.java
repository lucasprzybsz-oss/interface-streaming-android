package com.example.atividaderecyclerview;
import com.bumptech.glide.Glide;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmeAdapter extends RecyclerView.Adapter<FilmesViewHolder> {
    private ArrayList<Filme> filmes;
    public FilmeAdapter(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    @NonNull
    @Override    //define o layout padrao para cada filme
    public FilmesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater //transforma o xml em view
                .from(parent.getContext())
                .inflate(
                        R.layout.item_filme,
                        parent,
                        false
                );
        return new FilmesViewHolder(view);
    }


    @Override     //responsavel por anexar as informaçoes na caixa
    public void onBindViewHolder(@NonNull FilmesViewHolder holder, int position) {

        Filme filme = filmes.get(position);
        holder.tituloFilme.setText(filme.getTitulo());
        holder.descricaoFilme.setText(filme.getDescricao());
        holder.generoAno.setText(filme.getGenero() + " • " + filme.getAno());

        //carrega a imagem em url
        Glide.with(holder.itemView.getContext())
                .load(filme.getImagem())
                .into(holder.imageFilme);

        //define eventos para cada clique na caixa
        clique_curto(holder,filme);
        clique_longo(holder,filme,position);

    }
    private void clique_curto(FilmesViewHolder holder, Filme filme){
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        v.getContext(),
                        DetalhesFilmesActivity.class
                );

                intent.putExtra("filme", filme);

                v.getContext().startActivity(intent);
            }
        });
    }
    private void clique_longo(FilmesViewHolder holder, Filme filme, int position){
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(holder.itemView.getContext());

                builder.setTitle("Aviso");
                builder.setMessage("Deseja remover este Filme?");

                builder.setPositiveButton("Remover", ((dialog, which) -> {
                    remover_item(filme.getTitulo(),position,v);
                }));
                builder.setNegativeButton("Cancelar", null);

                AlertDialog alerta = builder.create();
                alerta.show();

                return true;
            }
        });
    }
    private void remover_item(String titulo, int position, View v){

        filmes.remove(position);
        notifyItemRemoved(position);

        Toast.makeText(
                v.getContext(),
                titulo + " foi removido da lista.",
                Toast.LENGTH_SHORT
        ).show();
    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }
}

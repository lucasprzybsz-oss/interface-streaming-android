package com.example.atividaderecyclerview;

import java.io.Serializable;

public class Filme implements Serializable {
    private String titulo;
    private String genero;
    private String ano;
    private String descricao;
    private String imagem;
    private int logo;

    public Filme(String titulo, String genero, String ano,
                 String descricao, String imagem, int logo) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.descricao = descricao;
        this.imagem = imagem;
        this.logo = logo;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public String getAno() { return ano; }
    public String getDescricao() { return descricao; }
    public String getImagem() { return imagem; }
    public int getLogo() { return logo; }

}

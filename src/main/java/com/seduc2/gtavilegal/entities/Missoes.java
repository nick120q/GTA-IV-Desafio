package com.seduc2.gtavilegal.entities;

import com.seduc2.gtavilegal.entities.enums.CategoriaArmas;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Missoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String local;
    private String dificuldade;
    private String imagem;
    private String descricao;

    public Missoes(){}

    public Missoes(int id, String nome, String local, String dificuldade, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Missoes(String nome, String local, String dificuldade, String imagem, String descricao) {
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

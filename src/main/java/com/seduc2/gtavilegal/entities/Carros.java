package com.seduc2.gtavilegal.entities;

import com.seduc2.gtavilegal.entities.enums.CategoriaArmas;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String categoria;
    private String fabricante;
    private String imagem;
    private String descricao;

    public Carros(){}

    public Carros(int id, String nome, String categoria, String fabricante, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Carros(String nome, String categoria, String fabricante, String imagem, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

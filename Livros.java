package com.livraria.livraria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Livros")
public class Livros {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Integer id;
    private String titulo;
    private String autor;
    private String genero;
    private String ano_publicado;

    public Livros(){}
    public Livros (Integer id, String titulo, String autor, String genero, String ano_publicado){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano_publicado = ano_publicado;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAno_publicado() {
        return ano_publicado;
    }
    public void setAno_publicado(String ano_publicado) {
        this.ano_publicado = ano_publicado;
    }

    
}

package com.github.joaophi.jsp.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Projeto {
    @EmbeddedId
    ProjetoId projetoId;

    @Column(nullable = false, length = 100)
    public String nome;

    @Column(length = 500)
    public String descricao;

    public Projeto() {
    }

    public Projeto(ProjetoId projetoId) {
        this.projetoId = projetoId;
    }

    public Projeto(ProjetoId projetoId, String nome, String descricao) {
        this.projetoId = projetoId;
        this.nome = nome;
        this.descricao = descricao;
    }

    public ProjetoId getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(ProjetoId projetoId) {
        this.projetoId = projetoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

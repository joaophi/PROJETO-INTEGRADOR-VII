package com.github.joaophi.jsp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Requisito implements Serializable {
    @EmbeddedId
    RequisitoId requisitoId;

    @MapsId("projetoId")
    @JoinColumns({
            @JoinColumn(name = "projetoId", referencedColumnName = "id"),
            @JoinColumn(name = "projetoVersao", referencedColumnName = "versao"),
    })
    @ManyToOne
    Projeto projeto;

    @Column(nullable = false, length = 45)
    String requisito;

    @Column(nullable = false, length = 500)
    String descricao;

    public Requisito() {
    }

    public Requisito(RequisitoId requisitoId, String requisito, String descricao) {
        this.requisitoId = requisitoId;
        this.projeto = new Projeto(requisitoId.projetoId);
        this.requisito = requisito;
        this.descricao = descricao;
    }

    public RequisitoId getRequisitoId() {
        return requisitoId;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public String getRequisito() {
        return requisito;
    }

    public String getDescricao() {
        return descricao;
    }
}

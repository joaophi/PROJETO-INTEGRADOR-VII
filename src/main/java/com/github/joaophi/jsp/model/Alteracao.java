package com.github.joaophi.jsp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Alteracao implements Serializable {
    @EmbeddedId
    AlteracaoId alteracaoId;

    @MapsId("projetoId")
    @JoinColumns({
            @JoinColumn(name = "projetoId", referencedColumnName = "id"),
            @JoinColumn(name = "projetoVersao", referencedColumnName = "versao"),
    })
    @ManyToOne
    Projeto projeto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuarioId")
    Usuario usuario;

    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime data;

    @Column(length = 500)
    String descricao;

    public Alteracao() {
    }

    public Alteracao(AlteracaoId alteracaoId, Projeto projeto, Usuario usuario, LocalDateTime data, String descricao) {
        this.alteracaoId = alteracaoId;
        this.projeto = projeto;
        this.usuario = usuario;
        this.data = data;
        this.descricao = descricao;
    }
}

package com.github.joaophi.jsp.model;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class RequisitoId implements Serializable {
    ProjetoId projetoId;

    public enum Tipo {FUNCIONAL, NAO_FUNCIONAL}

    Tipo tipo;

    Long id;

    public RequisitoId() {
    }

    public RequisitoId(ProjetoId projetoId, Long id, Tipo tipo) {
        this.projetoId = projetoId;
        this.id = id;
        this.tipo = tipo;
    }

    public ProjetoId getProjetoId() {
        return projetoId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Long getId() {
        return id;
    }
}

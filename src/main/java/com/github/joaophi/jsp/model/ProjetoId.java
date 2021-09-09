package com.github.joaophi.jsp.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProjetoId implements Serializable {
    Long id;

    Long versao;

    public ProjetoId() {
    }

    public ProjetoId(Long id, Long versao) {
        this.id = id;
        this.versao = versao;
    }

    public Long getId() {
        return id;
    }

    public Long getVersao() {
        return versao;
    }
}

package com.github.joaophi.jsp.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AlteracaoId implements Serializable {
    ProjetoId projetoId;

    public AlteracaoId() {
    }

    public AlteracaoId(ProjetoId projetoId) {
        this.projetoId = projetoId;
    }
}

package com.github.joaophi.jsp.dao;

import com.github.joaophi.jsp.model.ProjetoId;
import com.github.joaophi.jsp.model.Requisito;
import com.github.joaophi.jsp.model.RequisitoId;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface RequisitoRepository extends CrudRepository<Requisito, RequisitoId> {
    Collection<Requisito> findByRequisitoIdProjetoIdAndRequisitoIdTipo(ProjetoId projetoId, RequisitoId.Tipo tipo);
}

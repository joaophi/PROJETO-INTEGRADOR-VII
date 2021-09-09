package com.github.joaophi.jsp.dao;

import com.github.joaophi.jsp.model.Projeto;
import com.github.joaophi.jsp.model.ProjetoId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ProjetoRepository extends CrudRepository<Projeto, ProjetoId> {
    @Query(value = "" +
            " SELECT P.*" +
            " FROM projeto P" +
            "  INNER JOIN (" +
            "   SELECT id, MAX(versao) versao" +
            "   FROM projeto" +
            "   GROUP BY id" +
            "  ) X ON (    X.id = P.id" +
            "          AND X.versao = P.versao)", nativeQuery = true)
    Collection<Projeto> findAllProjetos();

    @Query(value = "SELECT MAX(versao) FROM projeto WHERE id = :id", nativeQuery = true)
    Long findVersao(@Param("id") Long id);
}

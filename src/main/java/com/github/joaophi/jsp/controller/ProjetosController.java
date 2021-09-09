package com.github.joaophi.jsp.controller;

import com.github.joaophi.jsp.dao.ProjetoRepository;
import com.github.joaophi.jsp.dao.RequisitoRepository;
import com.github.joaophi.jsp.model.ProjetoId;
import com.github.joaophi.jsp.model.Requisito;
import com.github.joaophi.jsp.model.RequisitoId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
public class ProjetosController {
    private final ProjetoRepository projetoRepository;
    private final RequisitoRepository requisitoRepository;

    public ProjetosController(ProjetoRepository projetoRepository, RequisitoRepository requisitoRepository) {
        this.projetoRepository = projetoRepository;
        this.requisitoRepository = requisitoRepository;
    }


    @GetMapping("/")
    public String getIndex(Model model,
                           @RequestParam(required = false) Long projetoId,
                           @RequestParam(defaultValue = "FUNCIONAL") RequisitoId.Tipo tipo,
                           @RequestParam(required = false) Long projetoVersao) {
        model.addAttribute("projetoId", projetoId);
        model.addAttribute("tipo", tipo);
        model.addAttribute("projetoVersao", projetoVersao);

        if (projetoId != null) {
            if (projetoVersao == null) {
                projetoVersao = projetoRepository.findVersao(projetoId);
            }
            Collection<Requisito> requisitos = requisitoRepository.findByRequisitoIdProjetoIdAndRequisitoIdTipo(new ProjetoId(projetoId, projetoVersao), tipo);
            model.addAttribute("requisitos", requisitos);
        }
        model.addAttribute("projetos", projetoRepository.findAllProjetos());
        return "index";
    }
}

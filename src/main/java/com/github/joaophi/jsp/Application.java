package com.github.joaophi.jsp;

import com.github.joaophi.jsp.dao.ProjetoRepository;
import com.github.joaophi.jsp.dao.RequisitoRepository;
import com.github.joaophi.jsp.dao.UsuarioRepository;
import com.github.joaophi.jsp.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Bean
    public CommandLineRunner demo(UsuarioRepository usuarioRepository,
                                  ProjetoRepository projetoRepository,
                                  RequisitoRepository requisitoRepository,
                                  PasswordEncoder encoder) {
        return (args) -> {
            usuarioRepository.save(new Usuario("João", "joaophickmann@outlook.com", encoder.encode("teste123"), true));
            usuarioRepository.save(new Usuario("Magnos", "magnos34@hotmail.com", encoder.encode("teste123"), false));

            projetoRepository.save(new Projeto(new ProjetoId(0L, 0L), "Teste", "Teste123"));
            projetoRepository.save(new Projeto(new ProjetoId(0L, 1L), "Teste2", "Teste123"));
            projetoRepository.save(new Projeto(new ProjetoId(1L, 0L), "Teste3", "Teste123"));

            requisitoRepository.save(new Requisito(new RequisitoId(new ProjetoId(1L, 0L), 1L, RequisitoId.Tipo.FUNCIONAL), "se", "fes"));
            requisitoRepository.save(new Requisito(new RequisitoId(new ProjetoId(1L, 0L), 1L, RequisitoId.Tipo.NAO_FUNCIONAL), "se2", "fes2"));
        };
    }

    @GetMapping("/requisito")
    public String getRequisito() {
        return "requisito";
    }

    @GetMapping("/usuario")
    public String getUsuario() {
        return "usuario";
    }
}
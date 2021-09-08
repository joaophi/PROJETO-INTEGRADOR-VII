package com.github.joaophi.jsp;

import com.github.joaophi.jsp.dao.UserRepository;
import com.github.joaophi.jsp.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public CommandLineRunner demo(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return (args) -> {
            userRepository.save(new User("joaophickmann@outlook.com", passwordEncoder.encode("teste123"), true));
            userRepository.save(new User("magnos34@hotmail.com", passwordEncoder.encode("teste123"), false));
        };
    }


    @GetMapping
    public String getIndex(Model model) {
        var projetos = new int[10];
        model.addAttribute("projetos", projetos);
        return "index";
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
package com.github.joaophi.jsp.model;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = false)
    public String nome;

    @Column(nullable = false, unique = true)
    public String email;

    @Column(nullable = false, length = 60)
    public String password;

    @Column(nullable = false)
    public Boolean administrator;

    public Usuario() {
    }

    public Usuario(String nome, String email, String password, boolean administrator) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.administrator = administrator;
    }
}

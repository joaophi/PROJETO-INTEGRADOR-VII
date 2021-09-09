package com.github.joaophi.jsp;

import com.github.joaophi.jsp.dao.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private final UsuarioRepository usuarioRepository;

    public MyUserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        var user = usuarioRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));
        return new MyUserDetails(user);
    }
}
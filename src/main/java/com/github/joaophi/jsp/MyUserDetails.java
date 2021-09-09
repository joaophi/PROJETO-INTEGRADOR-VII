package com.github.joaophi.jsp;

import com.github.joaophi.jsp.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class MyUserDetails implements UserDetails {
    private final Usuario user;

    public MyUserDetails(Usuario user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.administrator ? Collections.singleton(new SimpleGrantedAuthority("ADMIN")) : Collections.EMPTY_SET;
    }

    @Override
    public String getPassword() {
        return user.password;
    }

    @Override
    public String getUsername() {
        return user.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

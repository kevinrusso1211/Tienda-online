package com.kevin.tienda_online.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kevin.tienda_online.model.Usuario;
import com.kevin.tienda_online.repository.UsuarioRepository;

@Service
public class CustomDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email)
        throws UsernameNotFoundException {
            Usuario usuario = usuarioRepository.findByEmail(email);

            if(usuario == null) {
                throw new UsernameNotFoundException("Usuario no encontrado");
            }

            return User.builder()
                    .username(usuario.getEmail())
                    .password(usuario.getPassword())
                    .roles(usuario.getRol().name())
                    .build();
        }
}

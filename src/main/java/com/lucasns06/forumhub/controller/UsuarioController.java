package com.lucasns06.forumhub.controller;

import com.lucasns06.forumhub.domain.usuario.DadosCadastroUsuario;
import com.lucasns06.forumhub.domain.usuario.Usuario;
import com.lucasns06.forumhub.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/cadastrar")
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroUsuario dados){
        var usuario = new Usuario(dados);
        usuario.setSenha(passwordEncoder.encode(dados.senha()));
        repository.save(usuario);

        return ResponseEntity.ok(usuario);
    }
}

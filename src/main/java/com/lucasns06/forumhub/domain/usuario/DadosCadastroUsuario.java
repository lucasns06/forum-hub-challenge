package com.lucasns06.forumhub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotBlank
        @Email
        String login,
        @NotBlank
        String senha,
        @NotBlank
        String nome
) {
}

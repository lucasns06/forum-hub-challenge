package com.lucasns06.forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopico(
        @NotBlank
        String mensagem,
        @NotBlank
        String nomeCurso,
        @NotBlank
        String titulo
) {
}

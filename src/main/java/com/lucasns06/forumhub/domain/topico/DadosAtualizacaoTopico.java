package com.lucasns06.forumhub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        String mensagem,
        String titulo
) {

}

package com.lucasns06.forumhub.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, Status status, LocalDateTime dataCriacao) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getStatus(), topico.getDataCriacao());
    }
}

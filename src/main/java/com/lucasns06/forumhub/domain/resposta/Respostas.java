package com.lucasns06.forumhub.domain.resposta;

import com.lucasns06.forumhub.domain.topico.Topico;

import java.time.LocalDateTime;

public class Respostas {
    private Long id;
    private String mensagem;
    private Topico topico;
    private LocalDateTime dataCriacao;
//    private Usuario autor;
    private String solucao;
}

package com.lucasns06.forumhub.domain.topico;
import com.lucasns06.forumhub.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;


    public Topico(DadosCadastroTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.status = Status.NAO_RESPONDIDA;
        this.dataCriacao = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoTopico dados) {
        if (dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
        if (dados.titulo() != null){
            this.titulo = dados.titulo();
        }
    }
}

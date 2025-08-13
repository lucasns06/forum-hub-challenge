CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL UNIQUE,
    mensagem VARCHAR(100) NOT NULL UNIQUE,
    data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

create table usuarios(
    id bigint not null auto_increment,
    login varchar(100) not null,
    senha varchar(255) not null,
    nome varchar(100) not null,
    primary key(id)
);
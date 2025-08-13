create table topicos(
    id bigint not null auto_increment,
    titulo varchar (100) not null,
    mensagem varchar (100) not null,
    dataCriacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP not null,
    status varchar (100) not null,

    primary key (id)
);
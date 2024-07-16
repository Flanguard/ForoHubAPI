create table topicos(
    id bigint not null auto_increment,
    autor varchar(200) not null,
    mensaje varchar(600) not null unique,
    curso varchar(450) not null,
    titulo varchar(500) not null unique,
    status varchar(100) not null,
    fecha_creacion datetime not null,

    primary key(id)
);
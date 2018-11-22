CREATE DATABASE farmacia;
USE farmacia;

CREATE TABLE clientes(
id integer primary key auto_increment  not null,
nome varchar(255) not null,
tel varchar(10) not null,
cel varchar(11),
email varchar(255) not null,
dt_nasc date not null,
rg varchar(255) not null,
cpf varchar(255) not null
);

CREATE TABLE funcionarios(
id integer primary key auto_increment  not null,
nomeuser varchar(255) not null unique,
nome varchar(255) not null,
senha varchar(255) not null,
trocasenha varchar (5) not null,
data_adimissao date  not null,
salario double(10,2) not null,
tipo int
);

CREATE TABLE produtos(
id integer primary key auto_increment,
nome varchar(255) not null,
preco varchar(20)  not null,
tipo int,
validade varchar(255)  not null
);

CREATE TABLE vendas(
NumNota int primary key auto_increment,
data_venda date,
fk_prod int,
fk_func int,
fk_cli int,
valor varchar(255),
foreign key (fk_func) REFERENCES funcionarios(id),
foreign key (fk_cli) REFERENCES clientes(id),
foreign key (fk_prod) REFERENCES produtos(id)
);

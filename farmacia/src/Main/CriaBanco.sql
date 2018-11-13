CREATE DATABASE farmacia;
USE farmacia;

CREATE TABLE clientes(
id integer primary key auto_increment,
nome varchar(255) not null,
tel varchar(20),
email varchar(255),
dt_nasc date,
rg varchar(255),
cpf varchar(255)
);

CREATE TABLE funcionarios(
id integer primary key auto_increment,
nome varchar(255) not null,
senha varchar(255) not null,
data_adimissao date,
salario double(10,2),
tipo int
);

CREATE TABLE produtos(
id integer primary key auto_increment,
nome varchar(255) not null,
preco varchar(20),
tipo int,
validade varchar(255)
);

CREATE TABLE vendas(
NumNota int primary key auto_increment,
data_venda date,
fk_prod int,
fk_func int,
fk_cli int,
valor varchar(255),
foreign key fk_func REFERENCES funcionarios(id),
foreign key fk_cli REFERENCES clientes(id),
foreign key fk_prod REFERENCES produtos(id)
);


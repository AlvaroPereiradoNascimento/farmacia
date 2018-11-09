CREATE DATABASE farmacia;
USE farmacia;

CREATE TABLE cliente(
id integer primary key autoincrement,
nome varchar(255) not null,
tel varchar(20),
email varchar(255),
dt_nasc date,
rg varchar(255),
cpf varchar(255)
);

CREATE TABLE funcionario(
id integer primary key autoincrement,
nome varchar(255) not null,
senha varchar(255) not null,
data_adimissao date,
salario double(10,2),
tipo int
);

CREATE TABLE produto(
id integer primary key autoincrement,
nome varchar(255) not null,
preco varchar(20),
tipo int,
validade varchar(255)
);

-- CREATE TABLE vendas(
-- fk_func int,
-- fk_cli int,
-- data varchar(255),
-- fk_produto int,
-- valor varchar(255)
-- 
-- )


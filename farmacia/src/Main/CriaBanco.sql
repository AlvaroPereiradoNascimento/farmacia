CREATE DATABASE farmacia;
USE farmacia;

CREATE TABLE clientes(
id integer primary key auto_increment  unique,
nome varchar(255) ,
tel int(10) ,
cel int(11),
email varchar(255) ,
dt_nasc date ,
rg varchar(255) ,
cpf int(14) unique
);

CREATE TABLE funcionarios(
id integer primary key auto_increment  not null unique,
nomeuser varchar(255)  unique,
nome varchar(255) ,
senha varchar(255) ,
trocasenha varchar (5) ,
data_adimissao date  ,
salario double(10,2) ,
tipo int
);

CREATE TABLE produtos(
id integer primary key auto_increment unique ,
lote varchar(255)  unique,
nome varchar(255) ,
preco varchar(20) ,
tipo int,
validade varchar(255)  
);

CREATE TABLE vendas(
NumNota int primary key Not Null auto_increment unique,
data_venda date,
fk_prod int,
fk_func int,
fk_cli int,
valor varchar(255),
foreign key (fk_func ) REFERENCES funcionarios(id),
foreign key (fk_cli) REFERENCES clientes(id),
foreign key (fk_prod) REFERENCES produtos(id)
);

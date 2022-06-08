CREATE DATABASE db_java;
use db_java;

CREATE TABLE tb_usuario (
 id int PRIMARY KEY auto_increment,
 nome varchar(40) not null,
 usuario varchar(10) not null,
 senha varchar(20) not null
 );
 
INSERT INTO tb_usuario(nome, usuario, senha)VALUES('Administrador', 'admin', '12345'); 

SELECT * FROM tb_usuario;
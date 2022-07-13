[![jstl: ^1.2](https://img.shields.io/badge/jstl%3A-%201.2-blue.svg?style=flat)](http://www.java2s.com/Code/Jar/j/Downloadjstl12jar.htm)
[![mysql-connector-java: 8.0.29](https://img.shields.io/badge/mysqlconnectorjava%3A-%208.0.29-blue.svg?style=flat)](https://dev.mysql.com/downloads/connector/j)
[![TomCat 8.5](https://img.shields.io/badge/TomCat%3A-%208.5-blue.svg?style=flat)](https://tomcat.apache.org/download-80.cgi*)

## ☕ Sobre esse Projeto

Esta aplicação foi desenvolvida em Java Web JSP com banco de dados MySQL, fazendo CRUD de cadastros de logins. Fiz esse projeto com a finalidade de participar de um processo seletivo de estágio, porém acabei gostando bastante de fazer este desenvolvimento, pois utilizei Interfaces, JSP, Servlets e Materialize CSS, e algumas tecnicas de design patterns para fazer a organização do código.

## 📸 Galeria

https://user-images.githubusercontent.com/66914500/178740085-a40fb73c-353d-4e3b-afd7-a40b1855204f.mp4

## 🚩 Bibliotecas Utilizadas no Projeto: 

- **[jstl](http://www.java2s.com/Code/Jar/j/Downloadjstl12jar.htm)**
- **[mysql-connector-java](https://dev.mysql.com/downloads/connector/j)**
- **[tomcat 8.5](https://tomcat.apache.org/download-80.cgi)**

## 🚀 Instalando <JavaWebCrud>

Para instalar o <JavaWebCrud>, siga estas etapas:

1) Clone o repositório em sua máquina local e abra o projeto em sua IDE (utilizei o Eclipse para o desenvolvimento)
2) Abra o MySQL e execute o script que esta no arquivo ScriptJava.sql ou o script abaixo:

```sql
CREATE DATABASE IF NOT EXISTS CrudJava;

USE CrudJava;

CREATE TABLE IF NOT EXISTS LOGIN(
	  USER_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    USERNAME VARCHAR(45) NOT NULL,
    PSWD VARCHAR(255) NOT NULL,
    FULLNAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL UNIQUE
    ); 
```

3) Abra a pasta do projeto e modifique as strings de conexão com o banco em src/main/java/com/mresanto/util/Conexao

## ☕ Usando <JavaWebCrud>
  
 Execute a aplicação e teste sua conexão. Não esqueça de utilizar uma IDE com o server TomCat instalado.
  

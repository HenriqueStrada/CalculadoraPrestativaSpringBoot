# Calculadora Prestativa

## É um projeto onde utilizei Java com SpringBoot para rodar uma calculadora onde os processos são feitos no servidor, e retornados ao usuario.

---

## Para você rodar este projeto, precisa colocar este banco de dados em seu mySQL:

```sql
create database userdb;
use userdb;

create 	table users(
id CHAR(36) NOT NULL PRIMARY KEY,
username varchar(100) not null unique,
password varchar (100) not null
);

select 	 * from users;

---

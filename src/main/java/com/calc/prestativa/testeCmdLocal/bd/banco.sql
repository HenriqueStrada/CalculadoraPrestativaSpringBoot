create database users;
use users;

create table user(
                     id bigint primary key auto_increment,
                     nome varchar(150),
                     senha int not null
);
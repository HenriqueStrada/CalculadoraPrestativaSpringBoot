create database userdb;
use userdb;

create table users(
                      id bigint auto_increment primary key,
                      username varchar(100) not null,
                      password varchar (100) not null
);

select * from users;
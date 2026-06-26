create database contacts;
use contacts;

drop table contacts;

create table contacts(
   id int auto_increment primary key,
   name varchar(20),
   email varchar(100),
   message varchar(200)
);

desc contacts;

select * from contacts;
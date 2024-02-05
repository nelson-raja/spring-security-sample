drop table if exists users;

create table if not exists users (
    id int primary key AUTO_INCREMENT,
    username varchar(50),
    password varchar(50)
);
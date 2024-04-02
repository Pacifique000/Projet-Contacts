create database PROJET_BD;
use PROJET_BD;

create table if not exists Etudiant (
Code_ varchar(10) primary key,
nom varchar(20),
date_de_naissance date,
address varchar(20),
email varchar(15),
telNumber varchar(10),
Cycle varchar(50),
niveau numeric(2)
);
create table if not exists Enseignant(
Code_ varchar(10) primary key,
nom varchar(20),
date_de_naissance date,
address varchar(20),
email varchar(15),
telNumber varchar(10),
statut varchar(50)
);
create table Agent(
Code_ varchar(10) primary key,
nom varchar(20),
date_de_naissance date,
address varchar(20),
email varchar(15),
telNumber varchar(10),
salaire numeric(10),
statut varchar(50),
categorie varchar(10),
indice_de_salaire varchar(50),
occupation varchar(20)


);
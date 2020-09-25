# cria um banco de dados chamado agenda
create database agenda;

# apaga um banco de dados
drop database agenda;

# lista todos os bancos de dados criados
\l

# limpa o terminal

# windows
\! cls

# unix
\! clear

# conecta no banco de dados agenda
\c agenda;

# criando a tabela contato

# Contato
    # id
    # nome
    # email
    # endereco
    # data de nascimento
    
# constraint --> Restrição
create table contato(
    id              int,
    nome            varchar(50),
    email           varchar(50) unique,
    endereco        varchar(100),
    dataNascimento  date,
    primary key(id)
);

# Forma alternativa para a criacao da tabela

create table contato(
	id int primary key,
	nome varchar(50),
	email varchar(50),
	endereco varchar(100),
	dataNascimento date
);

# Exibe a estrutura da tabela contatos
\d contatos


# CRUD

# Inserindo informações na tabela contato
# insert implicito

insert into contato values 
(1, 'Ana', 'ana@gmail.com', 'Rua Z, 33', '1990/07/23');

# insert explicito        
insert into contato (endereco, id, email, nome) values
('Rua W', 2, 'carlos@email.com', 'Carlos');   

insert into contato (endereco, id, email, nome) values
('Rua W', 3, 'carlos@email.com1', 'Carlos');   

insert into contato (endereco, id, email, nome) values
('Rua W', 3, 'carlos@email.com1');delete from contato;    


# Consultando dados da tabela contatos
select * from contato;

select endereco, id, email, nome from contato\! cls;

# Atualizando um contato

update contato
set endereco = 'Rua Y, 789'
where id = 2;

# apagando um registro da tabela contatos
delete from contato
where id = 2;


# MUITO CUIDADO AO UTILIZAR OS COMANDOS 
# UPDATE E DELETE SEM A CLAUSULA WHERE

# Encerra o postgres
\q
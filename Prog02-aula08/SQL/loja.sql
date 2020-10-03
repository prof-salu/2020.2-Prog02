-- Apaga uma base de dados chamada loja
DROP DATABASE loja;

-- Cria um banco de dados chamado loja
CREATE DATABASE loja;

-- Conecta a base de dados loja
\c loja

-- Cria a tabela produtos
CREATE TABLE produtos(
	codigo BIGINT PRIMARY KEY,
	descricao VARCHAR(50),
	quantidade INTEGER,
	preco DEC(10,2)
);

-- Exibe a descricao da tabela produtos
\d produtos;
CREATE TABLE pessoa (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    lougradouro  VARCHAR(30),
    numero VARCHAR(30),
    complemento VARCHAR(30),
    bairro VARCHAR(30),
    cep VARCHAR (30),
    cidade VARCHAR (30),
    estado VARCHAR (30),
    ativo BOOLEAN NOT NULL
) ENGINE=innoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Guilherme', 'Rua Silva','103', 'casa', 'Jardim Flores', '13332421', 'Rio Preto', 'SP',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Ana', 'Rua Cabral','1020', 'ap', 'Jardim Neves', '13082411', 'Rio Flor', 'SP',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Jose', 'Rua São Jose','1100', 'casa', 'Parque Primavera', '13083321', 'Sertaozinho', 'SP',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Paulo', 'Rua 5 de novembro ','2100', 'casa', 'Jardim Alves', '13011121', 'Rio Flor', 'SP',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Gabriel', 'Rua Catatau','5100', 'ap', 'Parque dos Industriais', '12582421', 'Rio Flor', 'SP',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Fernando', 'Rua das pedras','1210', 'casa', 'Jardim Comercial', '13082978', 'Rio Flor', 'SP',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Joao', 'Rua das luzes','600', 'casa', 'Jardim Rural', '13082521', 'Araraquara', 'SP',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Roberta', 'Rua Espanha','1400', 'ap', 'Centro', '13082448', 'Rio de Janeiro', 'RJ',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Ruan', 'Rua chile','170', 'casa', 'Centro Norte', '13082461', 'Belo-Horizonte', 'BH',true );
INSERT INTO pessoa (nome, lougradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Leonardo', 'Rua alvares','1047', 'casa', 'Alvorada', '13082921', 'Rio Flor', 'SP',true );

-- Cria a tabela se não existir
CREATE TABLE IF NOT EXISTS core_veiculo
(
    id
    SERIAL
    PRIMARY
    KEY,
    ano
    INT,
    cor
    VARCHAR
(
    50
),
    data_atualizacao DATE,
    data_cadastro DATE,
    descricao TEXT,
    marca VARCHAR
(
    50
),
    modelo VARCHAR
(
    50
),
    numero_portas VARCHAR
(
    10
),
    placa VARCHAR
(
    10
),
    preco DECIMAL,
    quilometragem INT,
    status VARCHAR
(
    20
),
    tipo VARCHAR
(
    20
),
    tipo_combustivel VARCHAR
(
    20
)
    );

-- Insere um registro na tabela
INSERT INTO core_veiculo (ano, cor, data_atualizacao, data_cadastro, descricao, marca, modelo, numero_portas, placa,
                          preco, quilometragem, status, tipo, tipo_combustivel)
VALUES (2024, 'Preto', CURRENT_DATE, CURRENT_DATE, 'Descrição do veículo', 'Toyota', 'Corolla', 'QUATRO', '123ABC',
        200000, 10000, 'DISPONÍVEL', 'SEDAN', 'FLEX');

Insert into core_veiculo (ano, cor, data_atualizacao, data_cadastro, descricao, marca, modelo, numero_portas, placa,
                          preco, quilometragem, status, tipo, tipo_combustivel)
Values (1960, 'Preto', null, CURRENT_DATE, 'Carro', 'Ford', 'Mustang', 'DUAS', 'ABC123', 50000, 10000, 'DISPONIVEL',
        'ESPORTIVO', 'GASOLINA')
    Insert
into core_veiculo (ano, cor, data_atualizacao, data_cadastro, descricao, marca, modelo, numero_portas, placa, preco,
                   quilometragem, status, tipo, tipo_combustivel)
Values (1960, 'Preto', null, CURRENT_DATE, 'Carro', 'Ford', 'Mustang', 'DUAS', 'ABC123', 50000, 10000, 'DISPONIVEL', 'ESPORTIVO', 'GASOLINA')

Insert into core_veiculo (ano, cor, data_atualizacao, data_cadastro, descricao, marca, modelo, numero_portas, placa,
                          preco, quilometragem, status, tipo, tipo_combustivel)
Values (1960, 'Preto', null, CURRENT_DATE, 'Carro', 'Ford', 'Mustang', 'DUAS', 'ABC123', 50000, 10000, 'DISPONIVEL', 'ESPORTIVO', 'GASOLINA')
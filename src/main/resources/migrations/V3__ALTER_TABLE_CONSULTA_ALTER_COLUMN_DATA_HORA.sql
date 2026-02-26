-- V2: Altera a tabela "Consulta" almentando a escala do campo "data_hora"
ALTER TABLE consulta ALTER COLUMN data_hora TIMESTAMP(9);
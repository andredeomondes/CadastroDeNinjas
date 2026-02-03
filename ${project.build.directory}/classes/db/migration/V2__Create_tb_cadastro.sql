CREATE TABLE tb_cadastro (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nome VARCHAR(255) NOT NULL,
                             email VARCHAR(255) UNIQUE,
                             img_url VARCHAR(255),
                             idade INT,
                             rank VARCHAR(255),
                             missao_id BIGINT,
                             CONSTRAINT fk_missao FOREIGN KEY (missao_id) REFERENCES tb_missoes(id)
);
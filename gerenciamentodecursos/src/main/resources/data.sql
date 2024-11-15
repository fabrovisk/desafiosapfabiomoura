CREATE TABLE Aluno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    data_cadastro DATE NOT NULL
);

CREATE TABLE Curso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    data_criacao DATE NOT NULL
);

CREATE TABLE Inscricao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    aluno_id INT,
    curso_id INT,
    data_inscricao DATE NOT NULL,
    FOREIGN KEY (aluno_id) REFERENCES Aluno(id),
    FOREIGN KEY (curso_id) REFERENCES Curso(id)
);

INSERT INTO Aluno (nome, email, data_cadastro) VALUES
('Fábio Moura', 'fabio-arte@hotmail.com', '2024-11-14'),
('João Silva', 'joao.silva@email.com', '2024-01-10'),
('Maria Oliveira', 'maria.oliveira@email.com', '2024-02-15'),
('Carlos Souza', 'carlos.souza@email.com', '2024-03-05');

INSERT INTO Curso (nome, descricao, data_criacao) VALUES
('Academia SAP Accenture', 'Desafio academia SAP Commerce', '2024-11-13'),
('Curso de Java', 'Curso básico de programação Java', '2024-01-01'),
('Curso de SQL', 'Curso completo sobre Banco de Dados e SQL', '2024-02-01'),
('Curso de Python', 'Introdução à programação com Python', '2024-03-01');

INSERT INTO Inscricao (aluno_id, curso_id, data_inscricao) VALUES
(1, 1, '2024-11-15'),
(2, 2, '2024-01-12'),
(2, 3, '2024-01-15'),
(3, 3, '2024-02-20'),
(4, 4, '2024-03-10');

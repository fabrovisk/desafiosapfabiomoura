package com.academiasapfabiomoura.gerenciamentodecursos.repositories;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

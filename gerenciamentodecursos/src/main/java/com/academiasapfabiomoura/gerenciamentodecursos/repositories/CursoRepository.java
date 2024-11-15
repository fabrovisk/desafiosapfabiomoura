package com.academiasapfabiomoura.gerenciamentodecursos.repositories;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

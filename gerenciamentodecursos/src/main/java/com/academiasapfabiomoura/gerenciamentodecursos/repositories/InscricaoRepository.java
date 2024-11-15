package com.academiasapfabiomoura.gerenciamentodecursos.repositories;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
}

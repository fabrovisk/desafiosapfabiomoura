package com.academiasapfabiomoura.gerenciamentodecursos.populator;

import com.academiasapfabiomoura.gerenciamentodecursos.dto.AlunoDTO;
import com.academiasapfabiomoura.gerenciamentodecursos.dto.CursoDTO;
import com.academiasapfabiomoura.gerenciamentodecursos.models.Aluno;
import com.academiasapfabiomoura.gerenciamentodecursos.models.Curso;

public class InscricaoPopulator {

    public static AlunoDTO toDTO(Aluno aluno) {
        AlunoDTO dto = new AlunoDTO();
        dto.setId(aluno.getId());
        dto.setNome(aluno.getNome());
        dto.setEmail(aluno.getEmail());
        dto.setDataCadastro(aluno.getDataCadastro());
        return dto;
    }

    public static CursoDTO toDTO(Curso curso) {
        CursoDTO dto = new CursoDTO();
        dto.setId(curso.getId());
        dto.setNome(curso.getNome());
        dto.setDescricao(curso.getDescricao());
        dto.setDataCriacao(curso.getDataCriacao());
        
        return dto;
    }
}


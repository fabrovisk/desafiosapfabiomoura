package com.academiasapfabiomoura.gerenciamentodecursos.services;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Aluno;
import com.academiasapfabiomoura.gerenciamentodecursos.models.Curso;
import com.academiasapfabiomoura.gerenciamentodecursos.models.Inscricao;
import com.academiasapfabiomoura.gerenciamentodecursos.repositories.AlunoRepository;
import com.academiasapfabiomoura.gerenciamentodecursos.repositories.CursoRepository;
import com.academiasapfabiomoura.gerenciamentodecursos.repositories.InscricaoRepository;
import com.academiasapfabiomoura.gerenciamentodecursos.exceptions.AlunoNotFoundException;
import com.academiasapfabiomoura.gerenciamentodecursos.exceptions.CursoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    public Inscricao inscreverAluno(Long alunoId, Long cursoId) {
        // Buscar o aluno pelo ID
        Aluno aluno = alunoRepository.findById(alunoId)
                .orElseThrow(() -> new AlunoNotFoundException("Aluno não encontrado com id: " + alunoId));

        // Buscar o curso pelo ID
        Curso curso = cursoRepository.findById(cursoId)
                .orElseThrow(() -> new CursoNotFoundException("Curso não encontrado com id: " + cursoId));

        // Criar a inscrição e associar aluno e curso
        Inscricao inscricao = new Inscricao();
        inscricao.setAluno(aluno);
        inscricao.setCurso(curso);
        inscricao.setDataInscricao(new Date()); // Definir a data de inscrição

        // Salvar a inscrição no banco de dados
        return inscricaoRepository.save(inscricao);
    }
}

package com.academiasapfabiomoura.gerenciamentodecursos.services;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Aluno;
import com.academiasapfabiomoura.gerenciamentodecursos.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    // Método para salvar o aluno
    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Método para listar todos os alunos
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();  // Retorna todos os alunos do banco
    }

    // Método para buscar aluno por ID
    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}

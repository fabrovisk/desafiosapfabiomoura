package com.academiasapfabiomoura.gerenciamentodecursos.controllers;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Aluno;
import com.academiasapfabiomoura.gerenciamentodecursos.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // Endpoint para cadastrar aluno
    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

    // Endpoint para listar todos os alunos
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarTodos();
    }

    // Endpoint para buscar aluno por ID
    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable Long id) {
        return alunoService.buscarPorId(id);
    }
}

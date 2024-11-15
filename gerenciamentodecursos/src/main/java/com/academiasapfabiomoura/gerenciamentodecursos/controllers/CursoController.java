package com.academiasapfabiomoura.gerenciamentodecursos.controllers;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Curso;
import com.academiasapfabiomoura.gerenciamentodecursos.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    // Endpoint para cadastrar curso
    @PostMapping
    public Curso cadastrarCurso(@RequestBody Curso curso) {
        return cursoService.salvar(curso);
    }

    // Endpoint para listar todos os cursos
    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarTodos();
    }

    // Endpoint para buscar curso por ID
    @GetMapping("/{id}")
    public Curso buscarCursoPorId(@PathVariable Long id) {
        return cursoService.buscarPorId(id);
    }
}

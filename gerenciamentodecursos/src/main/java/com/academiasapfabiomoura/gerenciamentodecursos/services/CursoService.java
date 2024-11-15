package com.academiasapfabiomoura.gerenciamentodecursos.services;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Curso;
import com.academiasapfabiomoura.gerenciamentodecursos.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // Método para salvar o curso
    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }

    // Método para listar todos os cursos
    public List<Curso> listarTodos() {
        return cursoRepository.findAll();  // Retorna todos os cursos cadastrados
    }

    // Método para buscar curso por ID
    public Curso buscarPorId(Long id) {
        return cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }
}

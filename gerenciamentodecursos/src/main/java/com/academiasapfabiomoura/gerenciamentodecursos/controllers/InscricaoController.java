package com.academiasapfabiomoura.gerenciamentodecursos.controllers;

import com.academiasapfabiomoura.gerenciamentodecursos.models.Inscricao;
import com.academiasapfabiomoura.gerenciamentodecursos.services.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    // Endpoint para inscrever aluno em um curso
    @PostMapping("/inscrever")
    public ResponseEntity<Inscricao> inscreverAluno(@RequestParam Long alunoId, @RequestParam Long cursoId) {
        try {
            Inscricao inscricao = inscricaoService.inscreverAluno(alunoId, cursoId);
            return new ResponseEntity<>(inscricao, HttpStatus.CREATED); // Retorna status 201 Created com a inscrição
        } catch (RuntimeException e) {
            // Caso haja erro na inscrição (aluno ou curso não encontrado)
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); // Retorna status 400 Bad Request
        }
    }
}

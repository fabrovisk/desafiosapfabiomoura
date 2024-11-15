package com.academiasapfabiomoura.gerenciamentodecursos.exceptions;

public class CursoNotFoundException extends RuntimeException {
    public CursoNotFoundException(String message) {
        super(message);
    }
}
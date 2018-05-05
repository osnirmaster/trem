package com.vagas.trem.util;

public class ParNaoEncontradoException extends RuntimeException {
    private static final long serialVersionUID = 888412587590187957L;

    public ParNaoEncontradoException() {
        super("No route exists between " );
    }
}
package br.com.alura.loja.exception;

public class DomainException extends RuntimeException {
    private static final long serialVersionID = 1L;

    public DomainException() {
    }

    public DomainException(String message) {
        super(message);
    }

}

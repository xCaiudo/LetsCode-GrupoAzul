package br.com.letscode.java.biblioteca.livros;

public class LivroAlugadoException extends Exception {
    public LivroAlugadoException() { super("Este livro já foi alugado!");
    }
}

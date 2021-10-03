package br.com.letscode.java.biblioteca.livros;

public class LivroNaoExisteException extends Exception {
    public LivroNaoExisteException() {
        super("A biblioteca não possuí este livro! ");
    }
}

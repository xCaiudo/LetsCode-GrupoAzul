package br.com.letscode.java.biblioteca;

public class AlunoJaTemEmprestimoException extends Exception {
    public AlunoJaTemEmprestimoException() { super("Aluno já tem um emprestimo pendente!");
    }
}

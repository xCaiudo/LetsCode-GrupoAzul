package br.com.letscode.java.biblioteca.emprestimo;
import br.com.letscode.java.biblioteca.usuario.Usuario;
import br.com.letscode.java.biblioteca.livros.Livros;
import java.time.LocalDate;

public class LivroEmprestimo {
    private LocalDate dataEmprestimo;
    private Usuario user;
    private Livros liv;

    public LivroEmprestimo(){}

    public LivroEmprestimo(LocalDate dataEmprestimo, Usuario user, Livros liv) {
        this.dataEmprestimo = dataEmprestimo;
        this.user = user;
        this.liv = liv;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Usuario getUser() {
        return user;
    }

    public Livros getLiv() {
        return liv;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setLiv(Livros liv) {
        this.liv = liv;
    }
}

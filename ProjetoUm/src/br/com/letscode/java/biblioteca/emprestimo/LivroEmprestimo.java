package br.com.letscode.java.biblioteca.emprestimo;
import br.com.letscode.java.biblioteca.usuario.UsuarioDefault;
import br.com.letscode.java.biblioteca.livros.Livros;
import java.time.LocalDate;

public class LivroEmprestimo {
    private LocalDate dataEmprestimo;
    private UsuarioDefault user;
    private Livros liv;

    public LivroEmprestimo(){}

    public LivroEmprestimo(LocalDate dataEmprestimo, UsuarioDefault user, Livros liv) {
        this.dataEmprestimo = dataEmprestimo;
        this.user = user;
        this.liv = liv;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public UsuarioDefault getUser() {
        return user;
    }

    public Livros getLiv() {
        return liv;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setUser(UsuarioDefault user) {
        this.user = user;
    }

    public void setLiv(Livros liv) {
        this.liv = liv;
    }
}

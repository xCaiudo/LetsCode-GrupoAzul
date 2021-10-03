package br.com.letscode.java.biblioteca.usuario;

import br.com.letscode.java.biblioteca.Biblioteca;
import br.com.letscode.java.biblioteca.MaximoLivroDeUmaVezException;
import br.com.letscode.java.biblioteca.emprestimo.LivroEmprestimo;
import br.com.letscode.java.biblioteca.livros.EstadoLivro;
import br.com.letscode.java.biblioteca.livros.LivroAlugadoException;
import br.com.letscode.java.biblioteca.livros.LivroNaoExisteException;
import br.com.letscode.java.biblioteca.livros.Livros;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Usuario {
    private String nome;
    private int matricula;
    private String email;
    private LocalDate tempoSuspensao;
    private ArrayList<Livros> carrinhoLivros = new ArrayList<>();
    protected ArrayList<LivroEmprestimo> livroEmprestado = new ArrayList<>();

    public Usuario(String nome, int matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public void setTempoSuspensao(LocalDate tempoSuspensao) {
        this.tempoSuspensao = tempoSuspensao;
    }
    public LocalDate getTempoSuspensao() {
        return tempoSuspensao;
    }

    public ArrayList<Livros> getCarrinhoLivros() {
        return carrinhoLivros;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<LivroEmprestimo> getLivroEmprestado() {
        return livroEmprestado;
    }

    public void EscolherLivro(Livros livro, Biblioteca biblioteca) throws Exception {
        if (carrinhoLivros.size() == 3) {
            throw new MaximoLivroDeUmaVezException();
        }
        if (!biblioteca.getLivros().contains(livro)) {
            throw new LivroNaoExisteException();
        }
        if (livro.getEstado().equals(EstadoLivro.ALUGADO)) {
            throw new LivroAlugadoException();
        }

        this.carrinhoLivros.add(livro);
    }

    public void AdicionarLivro(LivroEmprestimo livroNovo) {
        this.livroEmprestado.add(livroNovo);
    }


    public abstract void RealizarDevolucao();

}

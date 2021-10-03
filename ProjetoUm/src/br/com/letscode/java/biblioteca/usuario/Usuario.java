package br.com.letscode.java.biblioteca.usuario;

import br.com.letscode.java.biblioteca.emprestimo.LivroEmprestimo;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Usuario {
    private String nome;
    private  int matricula;
    private String email;
    private LocalDate tempoSuspensao;

    public void setTempoSuspensao(LocalDate tempoSuspensao) {
        this.tempoSuspensao = tempoSuspensao;
    }

    protected ArrayList<LivroEmprestimo> livroEmprestado = new ArrayList<LivroEmprestimo>();


    public Usuario(String nome, int matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public Usuario(Usuario usuario) {
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


    public abstract void RealizarDevolucao(ArrayList<LivroEmprestimo> livroEmprestado);


}

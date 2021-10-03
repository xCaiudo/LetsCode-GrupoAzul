package br.com.letscode.java.biblioteca.usuario;

import br.com.letscode.java.biblioteca.emprestimo.LivroEmprestimo;
import br.com.letscode.java.biblioteca.livros.EstadoLivro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Aluno extends Usuario {


    public Aluno(String nome, int matricula, String email) {
        super(nome, matricula, email);
    }


    @Override
    public void RealizarDevolucao() {
        for (LivroEmprestimo livro : livroEmprestado) {
            livro.getLivro().setEstado(EstadoLivro.DISPONIVEL);
        }

        LocalDate data = LocalDate.now();
        LocalDate entrega = livroEmprestado.get(0).getDataParaDevolucao();
        if (data.isAfter(entrega)) {
            long dataDiferenca = ChronoUnit.DAYS.between(data, entrega);
            LocalDate dataSuspensao = entrega.plusDays(dataDiferenca);
            setTempoSuspensao(dataSuspensao);
        }
        livroEmprestado.clear();
    }
}


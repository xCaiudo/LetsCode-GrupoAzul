package br.com.letscode.java.biblioteca.emprestimo;

import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.Professor;
import br.com.letscode.java.biblioteca.usuario.Usuario;
import br.com.letscode.java.biblioteca.livros.Livros;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class LivroEmprestimo {
    private LocalDate dataEmprestimo;
    final private LocalDate dataParaDevolucao;
    private Usuario usuario;
    private Livros livro;
    private int diasUteis;

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataParaDevolucao() {
        return dataParaDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public LivroEmprestimo(LocalDate dataEmprestimo, Usuario usuario, Livros livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.usuario = usuario;
        this.livro = livro;


        if (this.usuario instanceof Aluno) {
            this.diasUteis = 10;
        } else if (this.usuario instanceof Professor) {
            this.diasUteis = 20;
        }
        this.dataParaDevolucao = CalculaDataDevolucao(this.diasUteis, this.dataEmprestimo);
    }

    private static LocalDate CalculaDataDevolucao(int diasUteisDesejado, LocalDate dataEmprestimo) {
        LocalDate data = dataEmprestimo;
        int diasUteis = 0;

        while (diasUteis < diasUteisDesejado) {
            data = data.plusDays(1);
            if (isDiaUtil(data)) {
                diasUteis++;
            }
        }
        return data;
    }

    private static boolean isDiaUtil(LocalDate data) {
        DayOfWeek dayOfWeek = data.getDayOfWeek();
        return !(SATURDAY.equals(dayOfWeek) || SUNDAY.equals(dayOfWeek) || isFeriado(data));
    }

    private static boolean isFeriado(LocalDate data) {
        List<Feriado> feriados = getFeriados();
        for (Feriado f : feriados) {
            if (f.getData().isEqual(data)) {
                return true;
            }
        }
        return false;
    }

    private static List<Feriado> getFeriados() {
        List<Feriado> feriadosList = new ArrayList<>();
        feriadosList.add(new Feriado(LocalDate.of(2021, 1, 1), "Confraternização Universal"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 4, 2), "Páscoa"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 4, 21), "Tiradentes"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 5, 1), "Dia do Trabalho"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 9, 7), "Independência"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 10, 12), "Padroeira do Brasil"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 11, 2), "Finados"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 11, 15), "Proclamação da República"));
        feriadosList.add(new Feriado(LocalDate.of(2021, 12, 25), "Natal"));
        return feriadosList;
    }
}

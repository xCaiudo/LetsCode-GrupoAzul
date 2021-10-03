package br.com.letscode.java.biblioteca.emprestimo;

import java.time.LocalDate;

public class Feriado {
   private LocalDate data;
   private String descricao;

    public Feriado(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Feriado{" +
                "data=" + data +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}



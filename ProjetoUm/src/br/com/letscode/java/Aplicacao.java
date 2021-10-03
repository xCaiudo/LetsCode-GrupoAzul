package br.com.letscode.java;
import br.com.letscode.java.biblioteca.*;
import br.com.letscode.java.biblioteca.livros.Livros;
import br.com.letscode.java.biblioteca.usuario.Aluno;

import java.util.Arrays;


public class Aplicacao {

    public static void main(String[] args) {
	// write your code here
        Biblioteca bib = new Biblioteca("","");
        Livros liv = new Livros("12312","algo","algo","algo");
        Livros liv2 = new Livros("12312","algo2","algo","algo");
        Aluno teste = new Aluno("teste",23112321,"231321");

        bib.AdicionarLivro(liv);
        bib.AdicionarLivro(liv2);
        try {
            teste.EscolherLivro(liv,bib);
            teste.EscolherLivro(liv2,bib);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            bib.EmprestarLivro((teste));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(teste.getLivroEmprestado().size());


       System.out.println(teste.getLivroEmprestado());







    }
}

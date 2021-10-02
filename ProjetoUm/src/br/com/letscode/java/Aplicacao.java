package br.com.letscode.java;
import br.com.letscode.java.biblioteca.*;
import br.com.letscode.java.biblioteca.livros.Livros;

import java.util.Arrays;


public class Aplicacao {

    public static void main(String[] args) {
	// write your code here
        Biblioteca bib = new Biblioteca("","");
        Livros liv = new Livros("12312","algo","algo","algo");
        Livros liv2 = new Livros("12312","algo2","algo","algo");



       bib.AdicionarLivro(liv);
       bib.AdicionarLivro(liv2);


       System.out.println(bib.getLivros());







    }
}

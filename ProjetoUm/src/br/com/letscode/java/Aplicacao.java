package br.com.letscode.java;
import br.com.letscode.java.biblioteca.*;
import br.com.letscode.java.biblioteca.livros.Livros;
import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.Professor;

import java.util.Arrays;


public class Aplicacao {

    public static void main(String[] args) {
	// write your code here
        Biblioteca bibliotecaEscolar = new Biblioteca("Biblioteca","Zona Norte");
        Livros livroUm = new Livros("12312","algo","algo","algo");
        Livros livroDois = new Livros("12312","algo2","algo","algo");
        Livros livroTres = new Livros("12312","algo2","algo","algo");
        Livros livroQuatro = new Livros("12312","algo2","algo","algo");
        Livros livroCinco = new Livros("12312","algo2","algo","algo");
        Livros livroSeis = new Livros("12312","algo2","algo","algo");
        Livros livroSete = new Livros("12312","algo2","algo","algo");
        Livros livroOito = new Livros("12312","algo2","algo","algo");
        Livros livroNove = new Livros("12312","algo2","algo","algo");
        Livros livroDez = new Livros("12312","algo2","algo","algo");
        Livros livroOnze = new Livros("12312","algo2","algo","algo");
        Aluno usuarioAluno = new Aluno("Aluno",23112321,"231321");
        Professor usuarioProfessor = new Professor("Professor", 1212122, "adsadsadsadsa");

        System.out.println( livroCinco.getEstado());
        System.out.println(usuarioAluno.getLivroEmprestado().size());
        System.out.println(usuarioProfessor.getLivroEmprestado().size());

        bibliotecaEscolar.AdicionarLivro(livroUm);
        bibliotecaEscolar.AdicionarLivro(livroDois);
        bibliotecaEscolar.AdicionarLivro(livroTres);
        bibliotecaEscolar.AdicionarLivro(livroQuatro);
        bibliotecaEscolar.AdicionarLivro(livroCinco);
        bibliotecaEscolar.AdicionarLivro(livroSeis);
        bibliotecaEscolar.AdicionarLivro(livroSete);
        bibliotecaEscolar.AdicionarLivro(livroOito);
        bibliotecaEscolar.AdicionarLivro(livroNove);
        bibliotecaEscolar.AdicionarLivro(livroDez);

        try {
            usuarioProfessor.EscolherLivro(livroDois, bibliotecaEscolar);
            usuarioProfessor.EscolherLivro(livroCinco, bibliotecaEscolar);
            usuarioProfessor.EscolherLivro(livroSete, bibliotecaEscolar);
            bibliotecaEscolar.EmprestarLivro(usuarioProfessor);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            usuarioProfessor.EscolherLivro(livroTres,bibliotecaEscolar);
            usuarioProfessor.EscolherLivro(livroOito,bibliotecaEscolar);
            bibliotecaEscolar.EmprestarLivro(usuarioProfessor);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println( livroCinco.getEstado());

        System.out.println(usuarioProfessor.getLivroEmprestado().size());
        System.out.println(usuarioProfessor.getCarrinhoLivros().size());

        System.out.println(bibliotecaEscolar.getLivros().size());








    }
}

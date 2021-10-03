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
        Livros livroUm = new Livros("12316","LivroA","AutorA","EditoraA");
        Livros livroDois = new Livros("123198","LivroB","AutorB","EditoraB");
        Livros livroTres = new Livros("1232456","LivroC","AutorC","EditoraC");
        Livros livroQuatro = new Livros("123935","LivroD","AutorD","EditoraD");
        Livros livroCinco = new Livros("12369546","LivroE","AutorE","EditoraE");
        Livros livroSeis = new Livros("123235","LivroF","AutorF","EditoraF");
        Livros livroSete = new Livros("1231221","LivroG","AutorG","EditoraG");
        Livros livroOito = new Livros("12312124","LivroH","AutorH","EditoraH");
        Livros livroNove = new Livros("1231267","LivroI","AutorI","EditoraI");
        Livros livroDez = new Livros("1231296","LivroJ","AutorJ","EditoraJ");
        Livros livroOnze = new Livros("1231234","LivroK","AutorK","EditoraK");
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

        try {
            usuarioAluno.EscolherLivro(livroUm, bibliotecaEscolar);
            usuarioAluno.EscolherLivro(livroQuatro, bibliotecaEscolar);
            usuarioAluno.EscolherLivro(livroNove, bibliotecaEscolar);
            bibliotecaEscolar.EmprestarLivro(usuarioAluno);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int qtdLivroEmprestadoAluno = usuarioAluno.getLivroEmprestado().size();

        System.out.println( livroCinco.getEstado());
        int qtdLivroEmprestadoProfessor = usuarioProfessor.getLivroEmprestado().size();

        System.out.println("Teste tamanho Array livroEmprestado Professor " + qtdLivroEmprestadoProfessor);
        System.out.println("Teste tamanho Array livrosCarrinho Professor " + usuarioProfessor.getCarrinhoLivros().size());

        for(int i = 0; i < qtdLivroEmprestadoProfessor; i++){
            System.out.println(usuarioProfessor.getLivroEmprestado().get(i).getLivro());
        }

        System.out.println("Teste tamanho Array livrosEmprestado Aluno " + qtdLivroEmprestadoAluno);
        System.out.println("Teste tamanho Array livrosCarrinho Aluno " + usuarioAluno.getCarrinhoLivros().size());

        for(int i = 0; i < qtdLivroEmprestadoAluno; i++){
            System.out.println(usuarioAluno.getLivroEmprestado().get(i).getLivro());
        }

        System.out.println(bibliotecaEscolar.getLivros().size());




    }
}

package br.com.letscode.java.biblioteca;

import br.com.letscode.java.biblioteca.emprestimo.LivroEmprestimo;
import br.com.letscode.java.biblioteca.livros.EstadoLivro;
import br.com.letscode.java.biblioteca.livros.LivroAlugadoException;
import br.com.letscode.java.biblioteca.livros.LivroNaoExisteException;
import br.com.letscode.java.biblioteca.livros.Livros;
import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;


public class Biblioteca {
    private String nome;
    private String local;
    private ArrayList<Livros> livro = new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public ArrayList<Livros> getLivros() {
        return livro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setLivros(ArrayList<Livros> livro) {
        this.livro = livro;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                '}';
    }

    public void AdicionarLivro(Livros livroNovo) {
        this.livro.add(livroNovo);


    }

    public void EmprestarLivro(Usuario usuario) throws Exception {
        LocalDate data = LocalDate.now();


        int qtd = usuario.getCarrinhoLivros().size();
        if (usuario instanceof Aluno) {
            int qtdLivroEmprestado = usuario.getLivroEmprestado().size();
            if (qtdLivroEmprestado > 0) {
                throw new AlunoJaTemEmprestimoException();
            } else {
                for (int i = 0; i < qtd; i++) {
                    Livros livroTemp = usuario.getCarrinhoLivros().get(i);
                    LivroEmprestimo novoLivroEmprestimo = new LivroEmprestimo(data, usuario, livroTemp);
                    usuario.AdicionarLivro(novoLivroEmprestimo);
                    livroTemp.setEstado(EstadoLivro.ALUGADO);

                }
                usuario.getCarrinhoLivros().clear();
            }
        } else {
            if ((usuario.getLivroEmprestado().size() + qtd) > 5) {
                throw new MaxLivroProfessorException();
            } else {
                for (int i = 0; i < qtd; i++) {
                    Livros livroTemp = usuario.getCarrinhoLivros().get(i);
                    LivroEmprestimo novoLivroEmprestimo = new LivroEmprestimo(data, usuario, livroTemp);
                    usuario.AdicionarLivro(novoLivroEmprestimo);
                    livroTemp.setEstado(EstadoLivro.ALUGADO);
                }
                usuario.getCarrinhoLivros().clear();

            }
        }


    }


}

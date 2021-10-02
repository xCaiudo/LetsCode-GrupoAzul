package br.com.letscode.java.biblioteca;
import br.com.letscode.java.biblioteca.livros.Livros;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca<Livros> {
    private String nome;
    private String local;
    private List<Livros> livro;

    public Biblioteca(){}

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

    public List<Livros> getLivros() {
        return livro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setLivros(List<Livros> livro) {
        this.livro = livro;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                '}';
    }

    public void CadastrarLivro(String isbn, String titulo, String autor, String editora){
        Livros  livroNovo = new Livros();
        this.livro.add(livroNovo);
    }

    public void EmprestarLivro( Pessoa pessoa, Livros livro, int qtd){


    }


}

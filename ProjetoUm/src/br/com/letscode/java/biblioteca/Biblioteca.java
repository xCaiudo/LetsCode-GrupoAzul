package br.com.letscode.java.biblioteca;
import br.com.letscode.java.biblioteca.livros.Livros;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca<Livros> {
    private String nome;
    private String local;
    private ArrayList <Livros> livro = new ArrayList<Livros>();

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

    public void AdicionarLivro(Livros livroNovo){
        this.livro.add(livroNovo);


    }

//    public void EmprestarLivro( Pessoa pessoa, Livros livro, int qtd){
//
//
//    }


}

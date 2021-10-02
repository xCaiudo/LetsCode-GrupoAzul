package br.com.letscode.java.biblioteca.livros;

public class Livros {

    private String isbn;
    private String titulo;
    private String autor;
    private String editora;
    private EstadoLivro estado = EstadoLivro.DISPONIVEL;

    public Livros() {
    }

    public Livros(String isbn, String titulo, String autor, String editora) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public EstadoLivro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLivro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", estado=" + estado +
                '}';
    }


}

package br.com.letscode.java;

import br.com.letscode.java.biblioteca.*;
import br.com.letscode.java.biblioteca.livros.Livros;
import br.com.letscode.java.biblioteca.usuario.Aluno;
import br.com.letscode.java.biblioteca.usuario.Professor;




public class Aplicacao {

    public static void main(String[] args) {
        Biblioteca bibliotecaEscolar = new Biblioteca("Biblioteca", "Zona Norte");
        Livros livroUm = new Livros("12316", "LivroA", "AutorA", "EditoraA");
        Livros livroDois = new Livros("123198", "LivroB", "AutorB", "EditoraB");
        Livros livroTres = new Livros("1232456", "LivroC", "AutorC", "EditoraC");
        Livros livroQuatro = new Livros("123935", "LivroD", "AutorD", "EditoraD");
        Livros livroCinco = new Livros("12369546", "LivroE", "AutorE", "EditoraE");
        Livros livroSeis = new Livros("123235", "LivroF", "AutorF", "EditoraF");
        Livros livroSete = new Livros("1231221", "LivroG", "AutorG", "EditoraG");
        Livros livroOito = new Livros("12312124", "LivroH", "AutorH", "EditoraH");
        Livros livroNove = new Livros("1231267", "LivroI", "AutorI", "EditoraI");
        Livros livroDez = new Livros("1231296", "LivroJ", "AutorJ", "EditoraJ");
        Livros livroOnze = new Livros("1231234", "LivroK", "AutorK", "EditoraK");
        Aluno usuarioAluno = new Aluno("Aluno", 23112321, "231321");
        Professor usuarioProfessor = new Professor("Professor", 1212122, "adsadsadsadsa");

        System.out.println("Checando estado do livro Cinco " + livroCinco.getEstado());
        System.out.println("Checando o tamanho inicial do arrayList de livroEmprestado do Aluno " + usuarioAluno.getLivroEmprestado().size());
        System.out.println("Checando o tamanho inicial do arrayList de livroEmprestado do Professor " + usuarioProfessor.getLivroEmprestado().size());

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
            usuarioProfessor.EscolherLivro(livroTres, bibliotecaEscolar);
            usuarioProfessor.EscolherLivro(livroOito, bibliotecaEscolar);
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

        System.out.println("Teste ap?? alugar o livro para o professor, o estado ??: " + livroCinco.getEstado());
        int qtdLivroEmprestadoProfessor = usuarioProfessor.getLivroEmprestado().size();

        System.out.println("Teste tamanho Array livroEmprestado Professor " + qtdLivroEmprestadoProfessor);
        System.out.println("Teste tamanho Array livrosCarrinho Professor " + usuarioProfessor.getCarrinhoLivros().size());

        System.out.println("Os livros que o Professor pegou foram: ");
        for (int i = 0; i < qtdLivroEmprestadoProfessor; i++) {
            System.out.println(usuarioProfessor.getLivroEmprestado().get(i).getLivro());
        }

        System.out.println("Teste tamanho Array livrosEmprestado Aluno " + qtdLivroEmprestadoAluno);
        System.out.println("Teste tamanho Array livrosCarrinho Aluno " + usuarioAluno.getCarrinhoLivros().size());

        System.out.println("Os livros que o Aluno pegou foram: ");
        for (int i = 0; i < qtdLivroEmprestadoAluno; i++) {
            System.out.println(usuarioAluno.getLivroEmprestado().get(i).getLivro());
        }

        System.out.println("Checando quantos livros possuimos na biblioteca -> " + bibliotecaEscolar.getLivros().size());
        System.out.println("Livros que a biblioteca possui: ");
        for(int i = 0; i< bibliotecaEscolar.getLivros().size();i++){
            System.out.println(bibliotecaEscolar.getLivros().get(i));
        }
        System.out.println("N??o adicionamos o livroOnze de proposito, as informa????es dele s??o para teste das " +
                "exceptions!");

        System.out.println();
        System.out.println();
        System.out.println("Testando a devolu????o do professor!");
        System.out.println();


        System.out.println("Teste para verificar a data que foi emprestado o livro para o Professor: " + usuarioProfessor.getLivroEmprestado().get(0).getDataEmprestimo());
        System.out.println("Teste para saber a data de devolu????o do livro do professor: " + usuarioProfessor.getLivroEmprestado().get(0).getDataParaDevolucao());
        usuarioProfessor.RealizarDevolucao();
        System.out.println("Teste ap??s devolu????o para saber o tempo de suspens??o, retorna null caso n??o tenha! -> " + usuarioProfessor.getTempoSuspensao());
        System.out.println("Checando o estado do livro ap??s a devolu????o ap??s entrega, utilizamos o livroOito -> " + livroOito.getEstado());
        System.out.println("Teste02 tamanho Array livroEmprestado Professor ap??s entrega " + usuarioProfessor.getLivroEmprestado().size());

        System.out.println();
        System.out.println();
        System.out.println("Agora os testes da devolu????o do aluno!");
        System.out.println();
        System.out.println("Teste para verificar a data que foi emprestado o livro para o Aluno: " + usuarioAluno.getLivroEmprestado().get(0).getDataEmprestimo());
        System.out.println("Teste para saber a data de devolu????o do livro do Aluno: " + usuarioAluno.getLivroEmprestado().get(0).getDataParaDevolucao());
        usuarioAluno.RealizarDevolucao();
        System.out.println("Teste ap??s devolu????o para saber o tempo de suspens??o, retorna null caso n??o tenha! -> " + usuarioAluno.getTempoSuspensao());
        System.out.println("Checando o estado do livro ap??s a devolu????o ap??s entrega, utilizamos o livroUm -> " + livroUm.getEstado());
        System.out.println("Teste02 tamanho Array livroEmprestado Aluno ap??s entrega " + usuarioAluno.getLivroEmprestado().size());

        System.out.println();
        System.out.println();
        System.out.println("?? possivel testar a devolu????o setando um valor para a variavel data e entrega dentro do " +
                "m??todo " +
                "RealizarDevolu????o e est?? funcionando tranquilamente!");

    }
}

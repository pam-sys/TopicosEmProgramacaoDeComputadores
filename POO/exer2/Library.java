package exer2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> livros;

    public Library() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Book livro) {
        livros.add(livro);
    }

    public Book buscarPorTitulo(String titulo) {
        for (Book b : livros) {
            if (b.getTitulo().equalsIgnoreCase(titulo)) {
                return b;
            }
        }
        return null;
    }

    public Book buscarPorTiulo(String titulo) {
        return buscarPorTitulo(titulo);
    }

    public ArrayList<Book> buscarPorAutor(String autor) {
        ArrayList<Book> resultado = new ArrayList<>();

        for (Book b : livros) {
            if (b.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public ArrayList<Book> buscarPorTituloOuAutor(String texto) {
        ArrayList<Book> resultado = new ArrayList<>();

        for (Book b : livros) {
            if (b.getTitulo().equalsIgnoreCase(texto) || b.getAutor().equalsIgnoreCase(texto)) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public void emprestarLivro(Book livro, Leitor leitor) {
        if (livro != null && leitor != null) {
            leitor.setLivroAtual(livro);
            livro.setMomentoEmprestimo(LocalDateTime.now());
        }
    }
}

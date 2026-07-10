package exer1;
import java.util.ArrayList;

public class Book {
    private final String isbn;
    private String titulo;
    private String autor;
    private ArrayList<Leitor>leitores;

    public Book(String isbn, String titulo, String autor){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.leitores = new ArrayList<>();
    }

    public String getIsbn(){
        return isbn;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public ArrayList<Leitor> getLeitores(){
        return leitores;
    }

    public void adicionarLeitor(Leitor leitor){
        leitores.add(leitor);
    }
}

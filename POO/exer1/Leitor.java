package exer1;

public class Leitor {
    private String nome;
    private int idade;
    private Book livroAtual;

    public Leitor(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public Book getLivroAtual(){
        return livroAtual;
    }

    public void setLivroAtual(Book livro) {
        this.livroAtual = livro;
        livro.adicionarLeitor(this);
    }
}

package list.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0) this.anoPublicacao = anoPublicacao;
        else this.anoPublicacao = 0;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String toString() {
        return ("Título: " + titulo + " - Autor: " + autor + " - Ano de publicação: " + anoPublicacao);
    }
}
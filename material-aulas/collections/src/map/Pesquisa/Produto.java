package map.Pesquisa;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return ("Produto: " + nome + " - Preço: " + preco + " - Quantidade: " + quantidade + "\n");
    }
}

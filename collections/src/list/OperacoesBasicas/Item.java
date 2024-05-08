package list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) this.preco = preco;
        else this.preco = 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) this.quantidade = quantidade;
        else this.quantidade = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return ("Nome: " + nome + " - Preco: " + preco + " - Quantidade: " + quantidade + "\n");
    }
}

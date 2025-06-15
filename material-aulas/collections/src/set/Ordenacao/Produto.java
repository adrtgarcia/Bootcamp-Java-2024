package set.Ordenacao;

public class Produto implements Comparable<Produto> {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade) {
        setNome(nome);
        setCodigo(codigo);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }    

    public String toString() {
        return ("Produto: " + nome + " - Código: " + codigo + " - Preço: " + preco + " - Quantidade: " + quantidade + "\n");
    }
}

package set.Ordenacao;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        if (produtoSet.isEmpty()) {
            throw new RuntimeException("Set vazio.");
        } else {
            Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
            return produtosPorNome;
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        if (produtoSet.isEmpty()) {
            throw new RuntimeException("Set vazio.");
        } else {
            Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        cadastroProdutos.adicionarProduto("Smartphone", 1, 1000, 10);
        cadastroProdutos.adicionarProduto("Notebook", 2, 1500, 5);
        cadastroProdutos.adicionarProduto("Mouse", 1, 30, 20);
        cadastroProdutos.adicionarProduto("Teclado", 4, 50, 15);
        
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
      }
}

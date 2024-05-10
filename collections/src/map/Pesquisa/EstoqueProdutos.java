package map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    private Map<Integer, Produto> produtoMap;

    public EstoqueProdutos() {
        produtoMap = new HashMap<>();
    }

    public void adicionarProduto(int codigo, String nome, int quantidade, double preco) {
        produtoMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!produtoMap.isEmpty()) {
            System.out.println(produtoMap);
        } else {
            System.out.println("Estoque de produtos vazio.");
        }
    }

    public double calcularValorTotalEstoque() {
        if (!produtoMap.isEmpty()) {
            double valorTotal = 0;
            for (Produto p : produtoMap.values()) {
                valorTotal += (p.getPreco() * p.getQuantidade());
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public Produto obterProdutoMaisCaro() {
        if (!produtoMap.isEmpty()) {
            Produto produtoMaisCaro = null;
            double maiorPreco = Double.MIN_VALUE;
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
            return produtoMaisCaro;
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public Produto obterProdutoMaisBarato() {
        if (!produtoMap.isEmpty()) {
            Produto produtoMaisBarato = null;
            double menorPreco = Double.MAX_VALUE;
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
            return produtoMaisBarato;
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        if (!produtoMap.isEmpty()) {
            Produto produtoMaiorValorTotal = null;
            double maiorValorTotal = 0;
            for (Produto p : produtoMap.values()) {
                double valorTotal = (p.getPreco() * p.getQuantidade());
                if (valorTotal > maiorValorTotal) {
                    maiorValorTotal = valorTotal;
                    produtoMaiorValorTotal = p;
                }
            }
            return produtoMaiorValorTotal;
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
 
        estoque.exibirProdutos();
 
        estoque.adicionarProduto(1, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4, "Teclado", 2, 40.0);
        
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}

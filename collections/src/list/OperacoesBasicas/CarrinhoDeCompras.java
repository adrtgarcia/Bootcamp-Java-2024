package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if (itemList.isEmpty()) {
            System.out.println("Erro: Lista vazia.");
        } else {
            List<Item> itensParaRemover = new ArrayList<>();
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }
    }

    public double calcularValorTotal() {
        if (!itemList.isEmpty()) {
            double valorTotal = 0;
            for (Item i : itemList) {
                valorTotal += (i.getPreco() * i.getQuantidade());
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Erro: Lista vazia.");
        }

    }

    public void exibirItens() {
        if (itemList.isEmpty()) {
            System.out.println("Erro: Lista vazia.");
        } else {
            System.out.println(itemList);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println();

        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();
        System.out.println();

        System.out.println("O valor total da compra é: R$ " + carrinhoDeCompras.calcularValorTotal() + "\n");
    }
}

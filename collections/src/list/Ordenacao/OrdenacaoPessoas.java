package list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        if (pessoaList.isEmpty()) throw new RuntimeException("Lista vazia.");
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        if (pessoaList.isEmpty()) throw new RuntimeException("Lista vazia.");
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
      
        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

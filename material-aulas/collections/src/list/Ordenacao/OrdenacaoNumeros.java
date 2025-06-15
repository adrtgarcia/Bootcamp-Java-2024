package list.Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Integer> intList;

    public OrdenacaoNumeros() {
        intList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        intList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        if (!intList.isEmpty()) {
            List<Integer> numerosAscendente = new ArrayList<>(intList);
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        if (!intList.isEmpty()) {
            List<Integer> numerosDescendente = new ArrayList<>(intList);
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public void exibirNumeros() {
        if (!intList.isEmpty()) {
            System.out.println(intList);
        } else {
            System.out.println("Lista vazia.");;
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        numeros.exibirNumeros();
    
        System.out.println(numeros.ordenarDescendente());
        numeros.exibirNumeros();
    }
}

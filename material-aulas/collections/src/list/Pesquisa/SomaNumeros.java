package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> intList;

    public SomaNumeros() {
        intList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        intList.add(numero);
    }

    public int calcularSoma() {
        if (!intList.isEmpty()) {
            int soma = 0;
            for (Integer i : intList) {
                soma += i;
            }
            return soma;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public int encontrarMaiorNumero() {
        if (!intList.isEmpty()) {
            int maiorNumero = intList.getFirst();
            for (Integer i : intList) {
                if (i > maiorNumero) {
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public int encontrarMenorNumero() {
        if (!intList.isEmpty()) {
            int menorNumero = intList.getFirst();
            for (Integer i : intList) {
                if (i < menorNumero) {
                    menorNumero = i;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public void exibirNumeros() {
        if (!intList.isEmpty()) {
            System.out.println(intList);
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
    
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
    
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();
    
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
    
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
    
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}

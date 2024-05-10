package map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    private Map<String, Integer> palavraMap;

    public ContagemPalavras() {
        palavraMap = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, int contagem) {
        palavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavraMap.isEmpty()) {
            palavraMap.remove(palavra);
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public void exibirContagemPalavras() {
        if (!palavraMap.isEmpty()) {
            System.out.println(palavraMap);
        } else {
            System.out.println("Sem registro de palavras.");
        }
    }

    public String encontrarPalavraMaisFrequente() {
        if (!palavraMap.isEmpty()) {
            String palavraMaisFrequente = null;
            int maiorFrquencia = 0;
            for (Map.Entry<String, Integer> entry : palavraMap.entrySet()) {
                if (entry.getValue() > maiorFrquencia) {
                    maiorFrquencia = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
            return palavraMaisFrequente;
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
    
        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);
    
        contagemPalavras.exibirContagemPalavras();
    
        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);
      }
}

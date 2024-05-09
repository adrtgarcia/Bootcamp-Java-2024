package map.OperacoesBasicas;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    private Map<String, String> palavraMap;

    public Dicionario() {
        palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavraMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!palavraMap.isEmpty()) {
            palavraMap.remove(palavra);
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public void exibirPalavras() {
        if (!palavraMap.isEmpty()) {
            System.out.println(palavraMap);
        } else {
            System.out.println("Dicionário vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!palavraMap.isEmpty()) {
            String definicaoPalavra = palavraMap.get(palavra);
            if (definicaoPalavra == null) {
                return "Palavra não encontrada.";
            } else {
                return definicaoPalavra;
            }
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
        dicionario.exibirPalavras();

        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}

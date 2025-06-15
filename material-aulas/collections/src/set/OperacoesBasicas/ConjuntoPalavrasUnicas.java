package set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraUnicaSet;

    public ConjuntoPalavrasUnicas() {
        palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraUnicaSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavraUnicaSet.isEmpty()) {
            if (palavraUnicaSet.contains(palavra)) {
                palavraUnicaSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada.");
            }
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        if (!palavraUnicaSet.isEmpty()) {
            return palavraUnicaSet.contains(palavra);
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public void exibirPalavrasUnicas() {
        if (!palavraUnicaSet.isEmpty()) {
            System.out.println(palavraUnicaSet);
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
    
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        conjuntoLinguagens.removerPalavra("Swift");
    
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));
    
        conjuntoLinguagens.exibirPalavrasUnicas();
      }
}

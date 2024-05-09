
package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if (!livroList.isEmpty()) {
            List<Livro> livrosPorAutor = new ArrayList<>();
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (!livroList.isEmpty()) {
            List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
            for (Livro l : livroList) {
                if ((l.getAnoPublicacao() >= anoInicial) && (l.getAnoPublicacao() <= anoFinal)) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!livroList.isEmpty()) {
            Livro livroPorTitulo = null;
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            if (livroPorTitulo == null) {
                throw new RuntimeException("Livro não encontrado.");
            } else {
                return livroPorTitulo;
            }
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
    
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
    
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));
    
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}

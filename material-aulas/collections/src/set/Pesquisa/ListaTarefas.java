package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;
    
    public ListaTarefas() {
        tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefaSet.isEmpty()) {
            Tarefa tarefaParaRemover = null;
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            if (tarefaParaRemover == null) {
                System.out.println("Tarefa não encontrada.");
            } else {
                tarefaSet.remove(tarefaParaRemover);
                System.out.println("Tarefa removida.");
            }
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Set vazio.");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        if (!tarefaSet.isEmpty()) {
            Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {
        if (!tarefaSet.isEmpty()) {
            Set<Tarefa> tarefasPendentes = new HashSet<>();
            for (Tarefa t : tarefaSet) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()) {
            Tarefa tarefaConcluida = null;
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                    tarefaConcluida = t;
                    break;
                }
            }
            if (tarefaConcluida == null) {
                System.out.println("Tarefa não encontrada.");
            }
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()) {
            Tarefa tarefaPendente = null;
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(false);
                    tarefaPendente = t;
                    break;
                }
            }
            if (tarefaPendente == null) {
                System.out.println("Tarefa não encontrada.");
            }
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public void limparListaTarefas() {
        if (!tarefaSet.isEmpty()) {
            tarefaSet.clear();
        } else {
            System.out.println("Set já está vazio.");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
    
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
        listaTarefas.exibirTarefas();
    
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}

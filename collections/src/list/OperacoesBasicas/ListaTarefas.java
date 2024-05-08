package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Comprar leite");
        listaTarefas.adicionarTarefa("Estudar para o exame");
        listaTarefas.adicionarTarefa("Fazer exercícios");
        System.out.println("\nVocê tem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas na lista.");
        listaTarefas.obterDescricoesTarefas();
        System.out.println();

        listaTarefas.removerTarefa("Trabalhar");
        System.out.println("\nVocê tem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas na lista.");
        listaTarefas.obterDescricoesTarefas();
        System.out.println();

        listaTarefas.removerTarefa("Estudar para o exame");
        System.out.println("\nVocê tem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas na lista.");
        listaTarefas.obterDescricoesTarefas();
        System.out.println();
    }
}
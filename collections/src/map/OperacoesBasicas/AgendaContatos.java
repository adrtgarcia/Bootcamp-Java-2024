package map.OperacoesBasicas;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    private Map<String, String> contatoMap;

    public AgendaContatos() {
        contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatoMap.isEmpty()) {
            contatoMap.remove(nome);
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public void exibirContatos() {
        if (!contatoMap.isEmpty()) {
            System.out.println(contatoMap);
        } else {
            System.out.println("Agenda de contatos vazia.");
        }
    }

    public void pesquisarPorNome(String nome) {
        if (!contatoMap.isEmpty()) {
            String telefonePorNome = contatoMap.get(nome);
            if (telefonePorNome == null) {
                System.out.println("Contato não encontrado.");
            } else {
                System.out.println("Telefone encontrado: " + telefonePorNome);
            }
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", "123456");
        agendaContatos.adicionarContato("João", "5665");
        agendaContatos.adicionarContato("Carlos", "1111111");
        agendaContatos.adicionarContato("Ana", "654987");
        agendaContatos.adicionarContato("Maria", "1111111");
        agendaContatos.adicionarContato("Camila", "44444");
        agendaContatos.exibirContatos();
    
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        String nomePesquisa = "João";
        System.out.println("Buscando telefone de " + nomePesquisa);
        agendaContatos.pesquisarPorNome(nomePesquisa);
        
        String nomePesquisaNaoExistente = "Paula";        
        System.out.println("Buscando telefone de " + nomePesquisaNaoExistente);
        agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
    }
}

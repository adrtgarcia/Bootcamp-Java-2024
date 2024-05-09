package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numeroTelefone) {
        contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        } else {
            System.out.println("Set vazio.");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        if (!contatoSet.isEmpty()) {
            Set<Contato> contatoPorNome = new HashSet<>();
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    contatoPorNome.add(c);
                }
            }
            return contatoPorNome;
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public void atualizarNumeroContato(String nome, String novoNumero) {
        if (!contatoSet.isEmpty()) {
            Contato contatoAtualizado = null; {
                for (Contato c : contatoSet) {
                    if (c.getNome().equalsIgnoreCase(nome)) {
                        c.setNumeroTelefone(novoNumero);
                        contatoAtualizado = c;
                        break;
                    }
                }
                if (contatoAtualizado == null) {
                    System.out.println("Contato não encontrado.");
                } else {
                    System.out.println(contatoAtualizado);
                }
            }
        } else {
            throw new RuntimeException("Set vazio.");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
    
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", "123456789");
        agendaContatos.adicionarContato("Maria", "987654321");
        agendaContatos.adicionarContato("Maria Fernandes", "55555555");
        agendaContatos.adicionarContato("Ana", "88889999");
        agendaContatos.adicionarContato("Fernando", "77778888");
        agendaContatos.adicionarContato("Carolina", "55555555");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    
        agendaContatos.atualizarNumeroContato("Carolina", "44443333");
    
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
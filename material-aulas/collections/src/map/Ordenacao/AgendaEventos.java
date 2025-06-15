package map.Ordenacao;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.time.LocalDate;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        eventoMap.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda() {
        if (!eventoMap.isEmpty()) {
            Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
            System.out.println(eventoTreeMap);
        } else {
            System.out.println("Agenda de eventos vazia.");
        }
    }

    public void obterProximoEvento() {
        if (!eventoMap.isEmpty()) {
            LocalDate dataAtual = LocalDate.now();
            LocalDate proximaData = null;
            Evento proximoEvento = null;
            for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
                LocalDate dataEvento = entry.getKey();
                if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                    proximaData = dataEvento;
                    proximoEvento = entry.getValue();
                    break;
                }
            }
            if (proximoEvento != null) {
                System.out.println("O próximo evento: " + proximoEvento.getNomeEvento() + " acontecerá na data " + proximaData);
            } else {
                System.out.println("Não há eventos futuros na agenda.");
            }
        } else {
            throw new RuntimeException("Map vazio.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 8, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
    
        agendaEventos.exibirAgenda();
    
        agendaEventos.obterProximoEvento();
    }
}
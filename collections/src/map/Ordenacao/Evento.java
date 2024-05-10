package map.Ordenacao;

public class Evento {
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        setNomeEvento(nomeEvento);
        setNomeAtracao(nomeAtracao);
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeAtracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public String toString() {
        return ("Nome do evento: " + nomeEvento + " - Nome da atração: " + nomeAtracao + "\n");
    }
}

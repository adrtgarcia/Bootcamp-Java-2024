import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        setTitulo(titulo);
        setDescricao(descricao);
        setData(data);
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public String toString() {
        return ("Título: " + getTitulo() + " - Descricao: " + getDescricao() + " - Data: " + data + "\n");
    }

    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}

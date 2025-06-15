public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descricao);
        setCargaHoraria(cargaHoraria);
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            this.cargaHoraria = 0;
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String toString() {
        return ("Título: " + getTitulo() + " - Descricao: " + getDescricao() + " - Carga horária: " + cargaHoraria + "\n");
    }

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}

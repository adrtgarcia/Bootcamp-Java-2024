public abstract class Conteudo {
    protected static final int XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularXp();
}

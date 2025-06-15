package set.Pesquisa;

public class Contato {
    private String nome;
    private String numeroTelefone;
   
    public Contato(String nome, String numeroTelefone) {
        setNome(nome);
        setNumeroTelefone(numeroTelefone);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroTelefone == null) ? 0 : numeroTelefone.hashCode());
        return result;
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (numeroTelefone == null) {
            if (other.numeroTelefone != null)
                return false;
        } else if (!numeroTelefone.equals(other.numeroTelefone))
            return false;
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String toString() {
        return ("Nome: " + nome + " - Número de telefone: " + numeroTelefone + "\n");
    }
}

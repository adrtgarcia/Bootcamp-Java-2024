package list.Ordenacao;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) this.idade = idade;
        else this.idade = 0;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        if (altura > 0) this.altura = altura;
        else this.altura = 0;
    }

    public double getAltura() {
        return altura;
    }

    public String toString() {
        return ("Nome: " + nome + " - Idade: " + idade + " - Altura: " + altura + "\n");
    }
}

package facade;

public class Service {
    private Service() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema.");
        System.out.println("\nNome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
    }
}

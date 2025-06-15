package facade;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String buscarCidade(String cep) {
        return "Cidade";
    }

    public String buscarEstado(String cep) {
        return "Estado";
    }
}

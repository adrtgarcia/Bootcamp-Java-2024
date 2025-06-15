package facade;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().buscarCidade(cep);
        String estado = CepApi.getInstancia().buscarEstado(cep);

        Service.gravarCliente(nome, cep, estado, cidade);
    }
}

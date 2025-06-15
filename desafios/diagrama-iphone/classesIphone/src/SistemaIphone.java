public class SistemaIphone implements ReprodutorMusical, AparelhoTelefonico, NavagadorNaInternet {
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }
    
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
    
    public void ligar() {
        System.out.println("Ligando.");
    }
    
    public void atender() {
        System.out.println("Atendendo ligação.");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador.");
    }
    
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navagador.");
    }
    
    public void recarregarPagina() {
        System.out.println("Recarregando página no navagador.");
    }
}

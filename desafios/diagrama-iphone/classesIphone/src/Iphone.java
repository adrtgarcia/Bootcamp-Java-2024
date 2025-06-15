public class Iphone {
    public static void main(String[] args) {
        SistemaIphone iphone = new SistemaIphone();

        System.out.println("Testando reprodutor musical:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("\nTestando aparelho telefônico:");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nTestando navagador na internet:");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.recarregarPagina();
    }
}

import singleton.*;
import strategy.*;
import facade.Facade;

public class Teste {
    public static void main(String[] args) {
        System.out.println("1) Testes com Singleton\n");

        Lazy instanciaLazy = Lazy.getInstancia();
        System.out.println("Singleton Lazy: " + instanciaLazy);
        instanciaLazy = Lazy.getInstancia();
        System.out.println("Singleton Lazy: " + instanciaLazy);
        
        Eager instanciaEager = Eager.getInstancia();
        System.out.println("\nSingleton Eager: " + instanciaEager);
        instanciaEager = Eager.getInstancia();
        System.out.println("Singleton Eager: " + instanciaEager);
        
        LazyHolder instanciaLazyHolder = LazyHolder.getInstancia();
        System.out.println("\nSingleton Lazy Holder: " + instanciaLazyHolder);
        instanciaLazyHolder = LazyHolder.getInstancia();
        System.out.println("Singleton Lazy Holder: " + instanciaLazyHolder);

        
        System.out.println("\n\n2) Testes com Strategy\n");
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();

        robo.setEstrategia(normal);
        robo.mover();
        robo.setEstrategia(defensivo);
        robo.mover();
        robo.setEstrategia(agressivo);
        robo.mover();


        System.out.println("\n\n3) Testes com Facade\n");
        
        Facade facade = new Facade();
        facade.migrarCliente("Cliente", "12345");
    }
}

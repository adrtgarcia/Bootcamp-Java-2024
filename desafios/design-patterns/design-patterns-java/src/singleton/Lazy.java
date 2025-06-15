package singleton;

public class Lazy {
    private static Lazy instancia;

    private Lazy() {
        super();
    }

    public static Lazy getInstancia() {
        if (instancia == null) {
            instancia = new Lazy();
        }
        return instancia;
    }
}

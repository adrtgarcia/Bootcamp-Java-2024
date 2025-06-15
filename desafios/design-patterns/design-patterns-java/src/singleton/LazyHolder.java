package singleton;

public class LazyHolder {
    private class Holder {
        public static LazyHolder instancia = new LazyHolder();
    }

    private LazyHolder() {
        super();
    }

    public static LazyHolder getInstancia() {
        return Holder.instancia;
    }
}
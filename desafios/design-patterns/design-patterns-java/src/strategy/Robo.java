package strategy;

public class Robo {
    private Comportamento estrategia;

    public void setEstrategia(Comportamento estrategia) {
        this.estrategia = estrategia;
    }

    public void mover() {
        estrategia.mover();
    }
}

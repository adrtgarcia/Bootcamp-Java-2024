public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv(boolean ligada, int canal, int volume) {
        setLigada(ligada);
        setCanal(canal);
        setVolume(volume);
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setCanal(int canal) {
        if (canal > 0) this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setVolume(int volume) {
        if ((volume >= 0) && (volume <= 100)) this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void ligarTv() {
        ligada = true;
    }

    public void desligarTv() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if (canal > 1) canal--;
    }

    public void mudarCanal(int canal) {
        setCanal(canal);
    }
}

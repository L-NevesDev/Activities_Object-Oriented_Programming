public class Tv {

    private static final int VOLUME_MAXIMO = 100;
    private static final int CANAL_MAXIMO = 999;

    private boolean ligada;
    private int volume;
    private int canal;

    public Tv() {
        this.ligada = false;
        this.volume = 10;
        this.canal = 1;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // Os métodos abaixo só funcionam com a TV ligada; devolvem false quando não conseguem agir.

    public boolean aumentarVolume() {
        if (!ligada || volume >= VOLUME_MAXIMO) {
            return false;
        }
        volume++;
        return true;
    }

    public boolean reduzirVolume() {
        if (!ligada || volume <= 0) {
            return false;
        }
        volume--;
        return true;
    }

    public boolean proximoCanal() {
        if (!ligada) {
            return false;
        }
        canal = (canal >= CANAL_MAXIMO) ? 1 : canal + 1;
        return true;
    }

    public boolean canalAnterior() {
        if (!ligada) {
            return false;
        }
        canal = (canal <= 1) ? CANAL_MAXIMO : canal - 1;
        return true;
    }

    @Override
    public String toString() {
        String status = ligada ? "ligada" : "desligada";
        return "TV " + status + " | Canal: " + canal + " | Volume: " + volume;
    }
}

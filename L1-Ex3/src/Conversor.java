public class Conversor {

    private double metros;

    public Conversor(double metros) {
        this.metros = metros;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double converterParaCentimetros() {
        return metros * 100;
    }
}

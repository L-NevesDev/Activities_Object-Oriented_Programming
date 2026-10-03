public class CaixaDagua {

    private double lado;

    public CaixaDagua(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Volume do cubo = lado^3 (em metros cúbicos, se o lado estiver em metros).
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}

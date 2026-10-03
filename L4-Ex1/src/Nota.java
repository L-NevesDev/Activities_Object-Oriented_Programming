public class Nota {

    private double valor;

    public Nota(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // A nota é válida quando está entre 0 e 10 (inclusive).
    public boolean ehValida() {
        return valor >= 0 && valor <= 10;
    }
}

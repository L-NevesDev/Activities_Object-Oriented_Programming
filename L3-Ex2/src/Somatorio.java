public class Somatorio {

    private double total;
    private int quantidade;

    public Somatorio() {
        this.total = 0;
        this.quantidade = 0;
    }

    public void adicionarValor(double valor) {
        total += valor;
        quantidade++;
    }

    public double getTotal() {
        return total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularMedia() {
        if (quantidade == 0) {
            return 0;
        }
        return total / quantidade;
    }
}

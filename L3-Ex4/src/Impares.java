public class Impares {

    private int inicio;
    private int fim;

    public Impares(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public void exibir() {
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

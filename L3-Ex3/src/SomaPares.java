public class SomaPares {

    private int inicio;
    private int fim;

    public SomaPares(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public int calcular() {
        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        return soma;
    }
}

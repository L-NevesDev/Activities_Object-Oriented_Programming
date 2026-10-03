public class ParImpar {

    private int numero;

    public ParImpar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean ehPar() {
        return numero % 2 == 0;
    }

    public String verificar() {
        if (ehPar()) {
            return "par";
        } else {
            return "ímpar";
        }
    }
}

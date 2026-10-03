public class Operacao {

    private int a;
    private int b;

    public Operacao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int calcular() {
        if (a == b) {
            return a + b;
        } else {
            return a * b;
        }
    }

    public String getOperacao() {
        if (a == b) {
            return "soma";
        } else {
            return "multiplicação";
        }
    }
}

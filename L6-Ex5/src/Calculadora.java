public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raiz(double numero) {
        return Math.sqrt(numero);
    }
}

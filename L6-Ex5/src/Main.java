import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        System.out.println("6 - Raiz");
        System.out.print("Opção: ");
        int opcao = leitor.nextInt();

        if (opcao >= 1 && opcao <= 5) {
            System.out.print("Digite o primeiro número: ");
            double a = leitor.nextDouble();

            System.out.print("Digite o segundo número: ");
            double b = leitor.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calculadora.somar(a, b));
                    break;
                case 2:
                    System.out.println("Resultado: " + calculadora.subtrair(a, b));
                    break;
                case 3:
                    System.out.println("Resultado: " + calculadora.multiplicar(a, b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Erro: não é possível dividir por zero.");
                    } else {
                        System.out.println("Resultado: " + calculadora.dividir(a, b));
                    }
                    break;
                case 5:
                    System.out.println("Resultado: " + calculadora.potencia(a, b));
                    break;
            }
        } else if (opcao == 6) {
            System.out.print("Digite um número: ");
            double numero = leitor.nextDouble();

            if (numero < 0) {
                System.out.println("Erro: não existe raiz quadrada real de número negativo.");
            } else {
                System.out.println("Raiz quadrada: " + calculadora.raiz(numero));
            }
        } else {
            System.out.println("Opção inválida!");
        }

        leitor.close();
    }
}

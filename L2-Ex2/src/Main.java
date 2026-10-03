import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = leitor.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = leitor.nextInt();

        Operacao operacao = new Operacao(a, b);

        System.out.println("Operação realizada: " + operacao.getOperacao());
        System.out.println("Resultado: " + operacao.calcular());

        leitor.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Somatorio somatorio = new Somatorio();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = leitor.nextDouble();
            somatorio.adicionarValor(valor);
        }

        System.out.printf("Total do somatório: %.2f%n", somatorio.getTotal());
        System.out.printf("Média dos valores lidos: %.2f%n", somatorio.calcularMedia());

        leitor.close();
    }
}

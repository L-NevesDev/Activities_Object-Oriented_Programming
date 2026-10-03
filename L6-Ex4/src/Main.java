import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do lado da caixa-d'água (em metros): ");
        double lado = leitor.nextDouble();

        CaixaDagua caixa = new CaixaDagua(lado);

        System.out.printf("A caixa-d'água suporta %.2f m³ de água.%n", caixa.calcularVolume());

        leitor.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = leitor.nextDouble();

        Conversor conversor = new Conversor(metros);

        System.out.printf("%.2f m equivalem a %.2f cm%n",
                conversor.getMetros(),
                conversor.converterParaCentimetros());

        leitor.close();
    }
}

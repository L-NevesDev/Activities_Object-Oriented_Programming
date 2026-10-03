import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a 1ª nota bimestral: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a 2ª nota bimestral: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a 3ª nota bimestral: ");
        double nota3 = leitor.nextDouble();

        Media media = new Media(nota1, nota2, nota3);

        System.out.printf("A média das notas é: %.2f%n", media.calcularMedia());

        leitor.close();
    }
}

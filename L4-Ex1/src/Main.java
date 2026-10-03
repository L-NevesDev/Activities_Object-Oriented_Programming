import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Nota nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = new Nota(leitor.nextDouble());

            if (!nota.ehValida()) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (!nota.ehValida());

        System.out.println("Nota válida informada: " + nota.getValor());

        leitor.close();
    }
}

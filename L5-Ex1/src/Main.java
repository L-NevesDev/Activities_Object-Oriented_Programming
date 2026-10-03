import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String entrada = leitor.nextLine();

        Palavra palavra = new Palavra(entrada);

        System.out.println("Palavra invertida: " + palavra.inverter());

        leitor.close();
    }
}

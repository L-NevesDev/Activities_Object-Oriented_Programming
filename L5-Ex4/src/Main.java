import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String entrada = leitor.nextLine();

        Frase frase = new Frase(entrada);

        System.out.println("Quantidade de vogais: " + frase.contarVogais());

        leitor.close();
    }
}

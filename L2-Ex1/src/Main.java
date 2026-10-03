import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        ParImpar parImpar = new ParImpar(numero);

        System.out.println("O número " + parImpar.getNumero() + " é " + parImpar.verificar() + ".");

        leitor.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidade;

        do {
            System.out.print("Quantos dígitos terá a senha? ");
            quantidade = leitor.nextInt();

            if (quantidade <= 0) {
                System.out.println("Quantidade inválida! Informe um número maior que zero.");
            }
        } while (quantidade <= 0);

        SenhaNumerica senha = new SenhaNumerica(quantidade);

        System.out.println("Senha gerada: " + senha.gerar());

        leitor.close();
    }
}

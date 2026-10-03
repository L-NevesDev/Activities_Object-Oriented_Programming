import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();

        FaixaEtaria faixaEtaria = new FaixaEtaria(idade);

        System.out.println("Faixa etária: " + faixaEtaria.classificar());

        leitor.close();
    }
}

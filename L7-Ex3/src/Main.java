import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Garrafa garrafa = new Garrafa(500);
        int opcao;

        do {
            System.out.println();
            System.out.println("=== GARRAFA ===");
            System.out.println("1 - Abrir garrafa");
            System.out.println("2 - Servir (ml)");
            System.out.println("3 - Ver status");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    if (garrafa.isAberta()) {
                        System.out.println("A garrafa já está aberta.");
                    } else {
                        garrafa.abrir();
                        System.out.println("Garrafa aberta!");
                    }
                    break;
                case 2:
                    System.out.print("Quantos ml deseja servir? ");
                    int ml = leitor.nextInt();

                    if (garrafa.servir(ml)) {
                        System.out.println(ml + " ml servidos.");
                    } else if (!garrafa.isAberta()) {
                        System.out.println("Não é possível servir: a garrafa está fechada.");
                    } else {
                        System.out.println("Quantidade inválida ou maior que o conteúdo restante.");
                    }
                    break;
                case 3:
                    System.out.println(garrafa);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        leitor.close();
    }
}

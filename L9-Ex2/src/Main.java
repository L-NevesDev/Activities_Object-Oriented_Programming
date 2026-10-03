import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Lampada[] lampadas = {
                new Lampada("Lâmpada 1"),
                new Lampada("Lâmpada 2"),
                new Lampada("Lâmpada 3")
        };

        int opcao;

        do {
            System.out.println();
            System.out.println("=== GERENCIADOR DE LÂMPADAS ===");
            System.out.println("1 - Ver o estado de todas as lâmpadas");
            System.out.println("2 - Alterar o estado de uma lâmpada");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    for (Lampada lampada : lampadas) {
                        lampada.apresentarEstado();
                    }
                    break;

                case 2:
                    System.out.print("Qual lâmpada (1 a 3)? ");
                    int numero = leitor.nextInt();

                    if (numero < 1 || numero > 3) {
                        System.out.println("Lâmpada inválida!");
                        break;
                    }

                    Lampada escolhida = lampadas[numero - 1];

                    System.out.println("1 - Apagar");
                    System.out.println("2 - Acender");
                    System.out.println("3 - Meia-luz");
                    System.out.print("Novo estado: ");
                    int novoEstado = leitor.nextInt();

                    switch (novoEstado) {
                        case 1:
                            escolhida.apagar();
                            break;
                        case 2:
                            escolhida.acender();
                            break;
                        case 3:
                            escolhida.meiaLuz();
                            break;
                        default:
                            System.out.println("Estado inválido!");
                            continue;
                    }

                    escolhida.apresentarEstado();
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

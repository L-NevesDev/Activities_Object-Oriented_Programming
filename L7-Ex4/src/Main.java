import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Tv tv = new Tv();
        int opcao;

        do {
            System.out.println();
            System.out.println("=== TV ===");
            System.out.println(tv);
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Aumentar volume");
            System.out.println("4 - Reduzir volume");
            System.out.println("5 - Próximo canal");
            System.out.println("6 - Canal anterior");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    tv.ligar();
                    break;
                case 2:
                    tv.desligar();
                    break;
                case 3:
                    if (!tv.aumentarVolume()) {
                        System.out.println(tv.isLigada() ? "Volume já está no máximo." : "A TV está desligada.");
                    }
                    break;
                case 4:
                    if (!tv.reduzirVolume()) {
                        System.out.println(tv.isLigada() ? "Volume já está no mínimo." : "A TV está desligada.");
                    }
                    break;
                case 5:
                    if (!tv.proximoCanal()) {
                        System.out.println("A TV está desligada.");
                    }
                    break;
                case 6:
                    if (!tv.canalAnterior()) {
                        System.out.println("A TV está desligada.");
                    }
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

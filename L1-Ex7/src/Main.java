import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = leitor.nextDouble();

        Temperatura temperatura = new Temperatura(fahrenheit);

        System.out.printf("%.2f °F equivalem a %.2f °C%n",
                temperatura.getFahrenheit(),
                temperatura.converterParaCelsius());

        leitor.close();
    }
}

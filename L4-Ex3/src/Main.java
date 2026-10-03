import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Nome (mais de 5 caracteres): ");
            nome = leitor.nextLine();

            if (!Pessoa.nomeValido(nome)) {
                System.out.println("Nome inválido! Deve ter mais de 5 caracteres.");
            }
        } while (!Pessoa.nomeValido(nome));

        int idade;
        do {
            System.out.print("Idade (entre 0 e 150): ");
            idade = leitor.nextInt();

            if (!Pessoa.idadeValida(idade)) {
                System.out.println("Idade inválida! Deve estar entre 0 e 150.");
            }
        } while (!Pessoa.idadeValida(idade));

        double salario;
        do {
            System.out.print("Salário (maior que zero): ");
            salario = leitor.nextDouble();

            if (!Pessoa.salarioValido(salario)) {
                System.out.println("Salário inválido! Deve ser maior que zero.");
            }
        } while (!Pessoa.salarioValido(salario));

        leitor.nextLine(); // consome a quebra de linha que sobrou do nextDouble

        String sexo;
        do {
            System.out.print("Sexo (Masculino ou Feminino): ");
            sexo = leitor.nextLine();

            if (!Pessoa.sexoValido(sexo)) {
                System.out.println("Sexo inválido! Digite \"Masculino\" ou \"Feminino\".");
            }
        } while (!Pessoa.sexoValido(sexo));

        Pessoa pessoa = new Pessoa(nome, idade, salario, sexo);

        System.out.println();
        System.out.println("=== Dados informados ===");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.printf("Salário: %.2f%n", pessoa.getSalario());
        System.out.println("Sexo: " + pessoa.getSexo());

        leitor.close();
    }
}

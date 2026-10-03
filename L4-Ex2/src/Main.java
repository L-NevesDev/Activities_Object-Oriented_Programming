import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Usuario usuario;

        do {
            System.out.print("Digite o nome de usuário: ");
            String nome = leitor.nextLine();

            System.out.print("Digite a senha: ");
            String senha = leitor.nextLine();

            usuario = new Usuario(nome, senha);

            if (!usuario.senhaValida()) {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        } while (!usuario.senhaValida());

        System.out.println("Usuário '" + usuario.getNome() + "' cadastrado com sucesso!");

        leitor.close();
    }
}

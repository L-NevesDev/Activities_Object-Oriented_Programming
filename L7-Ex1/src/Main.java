import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String arquivo = "cliente.dat";

        Cliente cliente = new Cliente("123.456.789-00", "Maria da Silva", "(19) 99999-0000");
        System.out.println("Objeto criado:  " + cliente);

        try {
            cliente.salvar(arquivo);
            System.out.println("Objeto gravado em '" + arquivo + "'.");

            Cliente lido = Cliente.ler(arquivo);
            System.out.println("Objeto lido:    " + lido);
        } catch (IOException e) {
            System.out.println("Erro de leitura/gravação: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada: " + e.getMessage());
        }
    }
}

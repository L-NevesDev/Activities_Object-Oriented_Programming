import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpf;
    private String nome;
    private String fone;

    public Cliente() {
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Cliente(String cpf, String nome, String fone) {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", nome=" + nome + ", fone=" + fone + "]";
    }

    public void salvar(String caminho) throws IOException {
        try (ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(caminho))) {
            saida.writeObject(this);
        }
    }

    public static Cliente ler(String caminho) throws IOException, ClassNotFoundException {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(caminho))) {
            return (Cliente) entrada.readObject();
        }
    }
}

public class Usuario {

    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    // A senha só é aceita se for diferente do nome do usuário.
    public boolean senhaValida() {
        return !senha.equals(nome);
    }
}

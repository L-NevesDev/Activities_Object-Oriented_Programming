public class Pessoa {

    private String nome;
    private int idade;
    private double salario;
    private String sexo;

    public Pessoa(String nome, int idade, double salario, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public String getSexo() {
        return sexo;
    }

    // Nome: maior que 5 caracteres
    public static boolean nomeValido(String nome) {
        return nome.length() > 5;
    }

    // Idade: entre 0 e 150
    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 150;
    }

    // Salário: maior que zero
    public static boolean salarioValido(double salario) {
        return salario > 0;
    }

    // Sexo: "Masculino" ou "Feminino"
    public static boolean sexoValido(String sexo) {
        return sexo.equals("Masculino") || sexo.equals("Feminino");
    }
}

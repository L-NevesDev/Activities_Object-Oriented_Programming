public class FaixaEtaria {

    private int idade;

    public FaixaEtaria(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String classificar() {
        if (idade >= 0 && idade <= 3) {
            return "Bebê";
        } else if (idade > 3 && idade <= 12) {
            return "Criança";
        } else if (idade > 12 && idade <= 18) {
            return "Adolescente";
        } else if (idade > 18 && idade <= 70) {
            return "Adulto";
        } else if (idade > 70 && idade <= 120) {
            return "Terceira idade";
        } else {
            return "Indeterminado";
        }
    }
}

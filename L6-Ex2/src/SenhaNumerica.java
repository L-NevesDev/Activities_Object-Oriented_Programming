public class SenhaNumerica {

    private int quantidadeDigitos;

    public SenhaNumerica(int quantidadeDigitos) {
        this.quantidadeDigitos = quantidadeDigitos;
    }

    public int getQuantidadeDigitos() {
        return quantidadeDigitos;
    }

    public void setQuantidadeDigitos(int quantidadeDigitos) {
        this.quantidadeDigitos = quantidadeDigitos;
    }

    // Sorteia um dígito de 0 a 9 para cada posição da senha.
    public String gerar() {
        String senha = "";

        for (int i = 0; i < quantidadeDigitos; i++) {
            int digito = (int) (Math.random() * 10);
            senha += digito;
        }

        return senha;
    }
}

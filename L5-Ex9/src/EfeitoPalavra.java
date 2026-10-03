public class EfeitoPalavra {

    private String palavra;

    public EfeitoPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    // Imprime a palavra letra por letra: J, Je, Jes, Jesu, Jesus...
    public void exibir() {
        for (int i = 1; i <= palavra.length(); i++) {
            System.out.println(palavra.substring(0, i));
        }
    }
}

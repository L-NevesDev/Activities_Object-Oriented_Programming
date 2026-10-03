public class Frase {

    private static final String VOGAIS = "aeiouáàâãäéèêëíìîïóòôõöúùûü";

    private String texto;

    public Frase(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Conta as vogais (maiúsculas, minúsculas e acentuadas).
    public int contarVogais() {
        int quantidade = 0;
        String minuscula = texto.toLowerCase();

        for (int i = 0; i < minuscula.length(); i++) {
            if (VOGAIS.indexOf(minuscula.charAt(i)) != -1) {
                quantidade++;
            }
        }

        return quantidade;
    }
}

public class Palavra {

    private String texto;

    public Palavra(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Percorre a palavra do último caractere para o primeiro (efeito espelho).
    public String inverter() {
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return invertida;
    }
}

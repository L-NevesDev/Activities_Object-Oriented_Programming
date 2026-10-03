public class Lampada {

    // Os três estados possíveis da lâmpada.
    public enum Estado {
        APAGADA, ACESA, MEIA_LUZ
    }

    private String nome;
    private Estado estado;

    // Toda lâmpada começa apagada.
    public Lampada(String nome) {
        this.nome = nome;
        this.estado = Estado.APAGADA;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void apagar() {
        estado = Estado.APAGADA;
    }

    public void acender() {
        estado = Estado.ACESA;
    }

    public void meiaLuz() {
        estado = Estado.MEIA_LUZ;
    }

    // Operação que apresenta o estado atual da lâmpada.
    public void apresentarEstado() {
        String descricao;

        switch (estado) {
            case ACESA:
                descricao = "acesa";
                break;
            case MEIA_LUZ:
                descricao = "em meia-luz";
                break;
            default:
                descricao = "apagada";
        }

        System.out.println(nome + " está " + descricao + ".");
    }
}

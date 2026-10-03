public class Garrafa {

    private boolean aberta;
    private int conteudoMl;

    // A garrafa começa fechada, com o conteúdo informado (em ml).
    public Garrafa(int conteudoMl) {
        this.conteudoMl = conteudoMl;
        this.aberta = false;
    }

    public boolean isAberta() {
        return aberta;
    }

    public int getConteudoMl() {
        return conteudoMl;
    }

    public void abrir() {
        aberta = true;
    }

    public boolean servir(int ml) {
        if (!aberta || ml <= 0 || ml > conteudoMl) {
            return false;
        }

        conteudoMl -= ml;
        return true;
    }

    @Override
    public String toString() {
        String status = aberta ? "aberta" : "fechada";
        return "Garrafa " + status + " com " + conteudoMl + " ml";
    }
}

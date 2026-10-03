public class Main {

    public static void main(String[] args) {
        Impares impares = new Impares(0, 20);

        System.out.println("Valores ímpares de " + impares.getInicio()
                + " até " + impares.getFim() + ":");
        impares.exibir();
    }
}

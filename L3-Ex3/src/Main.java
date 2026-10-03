public class Main {

    public static void main(String[] args) {
        SomaPares somaPares = new SomaPares(1, 500);

        System.out.println("Somatório dos valores pares de "
                + somaPares.getInicio() + " até " + somaPares.getFim()
                + ": " + somaPares.calcular());
    }
}

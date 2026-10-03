public class Temperatura {

    private double fahrenheit;

    public Temperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // C = (5 * (F - 32) / 9)
    public double converterParaCelsius() {
        return (5 * (fahrenheit - 32) / 9);
    }
}

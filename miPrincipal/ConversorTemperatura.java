package miPrincipal;

public class ConversorTemperatura {
    private double celsius;

    public ConversorTemperatura(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double aFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double aKelvin() {
        return celsius + 273.15;
    }
}
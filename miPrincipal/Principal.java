package miPrincipal;

public class Principal {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura(25);

        System.out.println("Celsius: " + conversor.getCelsius());
        System.out.println("Fahrenheit: " + conversor.aFahrenheit());
        System.out.println("Kelvin: " + conversor.aKelvin());
    }
}
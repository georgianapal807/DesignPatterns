package factory;

public class PizzaFactory {

    public static Pizza get(final String country) {
        return switch (country) {
            case "RO" -> new PizzaDiavola();
            case "US" -> new PizzaQuatroFromagi();
            default -> new PizzaMargherita();
        };
    }
}

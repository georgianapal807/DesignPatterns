package factory;

public class PizzaQuatroFromagi implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking quatro formagi. I love cheese!");
    }
}

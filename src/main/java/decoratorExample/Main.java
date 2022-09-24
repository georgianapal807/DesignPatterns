package decoratorExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pasta pasta = Pasta.builder()
                .ingredients(List.of("Pasta","Water", "Salt", "Olive Oil"))
                .build();
        pasta.displayIngredients();
        Pasta carbonara = PastaDecorator.builder()
                .pasta(pasta)
                .ingredients(List.of("Eggs", "Parmigiano", "Bacon"))
                .build();
        carbonara.displayIngredients();
    }
}

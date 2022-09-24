package decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree = ChristmasTree.builder()
                .height(150)
                .weight(5)
                .type("Artificial")
                .build();
        tree.display();
        System.out.println();

        ChristmasTree decoratedTree = ChristmasTreeDecorator.builder()
                .tree(tree)
                .decorations(List.of("Lights", "Globes", "Candy"))
                .build();
        decoratedTree.display();
    }
}

package decorator;

import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
public class ChristmasTreeDecorator extends ChristmasTree {
    private ChristmasTree tree;
    private List<String> decorations;

    public void display() {
//        System.out.println("I have a lovely Christmas Tree" +
//                tree +
//                "with the following decorations " +
//                decorations);
        System.out.println(String.format("I have a lovely Christmas Tree %s and the following decorations %s %n",
                tree, decorations));
    }
}


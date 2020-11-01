package andrey.patterns.creational.abstractfactory.lunch;

import andrey.patterns.creational.abstractfactory.Drink;

public class Lemonade implements Drink {
    @Override
    public void description() {
        System.out.println("A glass of cold lemonade");
    }
}

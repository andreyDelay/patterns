package andrey.patterns.creational.abstractfactory.lunch;

import andrey.patterns.creational.abstractfactory.Dessert;

public class Cake implements Dessert {
    @Override
    public void description() {
        System.out.println("A piece of sweet cake");
    }
}

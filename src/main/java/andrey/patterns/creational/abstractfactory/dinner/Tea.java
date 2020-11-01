package andrey.patterns.creational.abstractfactory.dinner;

import andrey.patterns.creational.abstractfactory.Drink;

public class Tea implements Drink {

    @Override
    public void description() {
        System.out.println("A cup of green tea");
    }
}

package andrey.patterns.structural.decorator;

public class HeadphonesColor extends HeadphonesDecorator{

    public HeadphonesColor(HeadPhones headPhones) {
        super(headPhones);
    }

    @Override
    public void phones() {
        super.phones();
        System.out.print(" Of white Color.");
    }
}

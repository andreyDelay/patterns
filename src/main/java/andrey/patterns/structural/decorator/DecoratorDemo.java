package andrey.patterns.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        HeadPhones headPhones = new HeadphonesColor(new WirelessHeadphones(new OverHeadPhones()));
        headPhones.phones();
    }
}

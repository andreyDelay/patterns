package andrey.patterns.structural.decorator;

public class WirelessHeadphones extends HeadphonesDecorator{
    public WirelessHeadphones(HeadPhones headPhones) {
        super(headPhones);
    }

    @Override
    public void phones() {
        super.phones();
        System.out.print(" Wireless model.");
    }
}

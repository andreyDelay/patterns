package andrey.patterns.structural.decorator;

public abstract class HeadphonesDecorator implements HeadPhones {
    private HeadPhones headPhones;

    public HeadphonesDecorator(HeadPhones headPhones) {
        this.headPhones = headPhones;
    }

    @Override
    public void phones() {
        headPhones.phones();
    }
}

package andrey.patterns.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Screen phone0 = new PhoneScreen();
        Screen phone1 = new PhoneScreen();
        Screen phone2 = new PhoneScreen();

        Screen tv0 = new TVScreen();
        Screen tv1 = new TVScreen();
        Screen tv2 = new TVScreen();

        Screen PC0 = new ComputerScreen();
        Screen PC1 = new ComputerScreen();
        Screen PC2 = new ComputerScreen();

        Composite phones = new Composite();
        Composite tv = new Composite();
        Composite pc = new Composite();

        Composite general = new Composite();

        phones.addComponent(phone0);
        phones.addComponent(phone1);
        phones.addComponent(phone2);

        tv.addComponent(tv0);
        tv.addComponent(tv1);
        tv.addComponent(tv2);

        pc.addComponent(PC0);
        pc.addComponent(PC1);
        pc.addComponent(PC2);

        general.addComponent(phones);
        general.addComponent(tv);
        general.addComponent(pc);

        general.showContent();
    }
}

package andrey.patterns.structural.adapter.correctimplementation;

public class AdapterDemo {
    public static void main(String[] args) {
        PhoneScreen phone = new Adapter();
        phone.showMassage("Привет");

    }
}

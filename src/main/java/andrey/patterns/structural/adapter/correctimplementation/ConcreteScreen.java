package andrey.patterns.structural.adapter.correctimplementation;

public class ConcreteScreen implements PhoneScreen{
    @Override
    public void showMassage(String massage) {
        System.out.println("Massage");
    }
}

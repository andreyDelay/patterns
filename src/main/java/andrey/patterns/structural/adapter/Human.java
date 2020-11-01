package andrey.patterns.structural.adapter;

public class Human implements CommonHello{
    @Override
    public String sayHello() {
        return "Привеееет!!!";
    }

    @Override
    public String sayGoodbye() {
        return "До свидания!!!";
    }
}

package andrey.patterns.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        CommonHello commonHello = new HelloAdapter();

        System.out.println(commonHello.sayHello());
        System.out.println(commonHello.sayGoodbye());
    }
}

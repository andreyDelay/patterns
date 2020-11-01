package andrey.patterns.structural.adapter;

public class HelloAdapter extends Cat implements CommonHello{

    @Override
    public String sayHello() {
        return sayHelloLikeACat();
    }

    @Override
    public String sayGoodbye() {
        return sayByeLikeACat();
    }
}

package andrey.patterns.structural.adapter;

public class Cat implements CatHello{

    @Override
    public String sayHelloLikeACat() {
        return "meeeow!";
    }

    @Override
    public String sayByeLikeACat() {
        return "meow((";
    }
}

package andrey.patterns.structural.composite;

public class PhoneScreen implements Screen{
    @Override
    public void showContent() {
        System.out.println("I'm your phone's screen, " +
                "don't look at me for a long time. It is dangerous!");
    }
}

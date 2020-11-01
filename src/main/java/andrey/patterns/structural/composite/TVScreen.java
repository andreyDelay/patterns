package andrey.patterns.structural.composite;

public class TVScreen implements Screen{
    @Override
    public void showContent() {
        System.out.println("I'm your big TV's screen." +
                "Don't be to close to me, it is dangerous!");
    }
}

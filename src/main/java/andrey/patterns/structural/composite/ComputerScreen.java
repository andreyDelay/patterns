package andrey.patterns.structural.composite;

public class ComputerScreen implements Screen{
    @Override
    public void showContent() {
        System.out.println("I'm your computer's screen. " +
                "If you wanna have good skills in coding you must spend a lot of time across me!");
    }
}

package andrey.patterns.structural.bridge.colors;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("red");
    }
}

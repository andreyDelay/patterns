package andrey.patterns.structural.bridge;

import andrey.patterns.structural.bridge.colors.GreenColor;
import andrey.patterns.structural.bridge.colors.RedColor;

public class BridgeDemo {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}

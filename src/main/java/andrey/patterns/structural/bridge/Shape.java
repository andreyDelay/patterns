package andrey.patterns.structural.bridge;

import andrey.patterns.structural.bridge.colors.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}

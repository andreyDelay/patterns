package andrey.patterns.creational.prototype.first;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof Shape)) return false;
        Shape anotherShape = (Shape) another;

        return anotherShape.x == x &&
                anotherShape.y == y &&
                Objects.equals(anotherShape.color, color);
    }
}

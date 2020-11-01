package andrey.patterns.creational.prototype.first;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof Circle)) return false;
        Circle anotherShape = (Circle) another;
        return anotherShape.radius == radius;
    }
}

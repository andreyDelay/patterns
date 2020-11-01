package andrey.patterns.creational.prototype.first;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof Rectangle)) return false;
        Rectangle anotherShape = (Rectangle) another;
        return anotherShape.width == width && anotherShape.height == height;
    }
}

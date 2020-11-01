package andrey.patterns.creational.prototype.first;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        List<Shape> copyList = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapeList.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapeList.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapeList.add(rectangle);

        cloneAndCompare(shapeList,copyList);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape: shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Разные объекты");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": Но они идентичны!");
                } else {
                    System.out.println(i + ": Но они не идентичны!");
                }
            } else {
                System.out.println(i + ": Это одинаковые объекты");
            }
        }
    }
}

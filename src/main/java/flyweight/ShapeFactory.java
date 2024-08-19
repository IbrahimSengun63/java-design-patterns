package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> circleMap = new HashMap<>();

    public Shape getCircle(String color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a " + color + " circle");
        }

        return circle;
    }
}

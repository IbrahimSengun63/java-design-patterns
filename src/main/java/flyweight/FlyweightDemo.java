package flyweight;

public class FlyweightDemo {
    private static final String[] colors = {"Red", "Green", "Blue", "Black", "White"};

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Draw 10 circles with different positions and colors
        for (int i = 0; i < 10; ++i) {
            Shape circle = shapeFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(), getRandomY());
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

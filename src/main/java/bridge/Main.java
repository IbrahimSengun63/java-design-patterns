package bridge;

public class Main {
    public static void main(String[] args) {
        // Create a CircleShape with DrawingAPI1
        Shape circle1 = new CircleShape(1, 2, 3, new DrawingAPI1());
        circle1.draw();
        circle1.resizeByPercentage(10);
        circle1.draw();

        // Create a CircleShape with DrawingAPI2
        Shape circle2 = new CircleShape(5, 7, 11, new DrawingAPI2());
        circle2.draw();
        circle2.resizeByPercentage(20);
        circle2.draw();
    }
}

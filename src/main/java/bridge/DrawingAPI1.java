package bridge;

// ConcreteImplementor A
public class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("DrawingAPI1: Drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
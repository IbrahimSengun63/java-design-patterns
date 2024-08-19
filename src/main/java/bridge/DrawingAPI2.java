package bridge;

public class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("DrawingAPI2: Drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
package bridge;

// Abstraction class
public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw(); // Abstraction of drawing operation
    public abstract void resizeByPercentage(double pct); // Abstraction of resizing operation
}

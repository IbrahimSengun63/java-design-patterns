package builder;

public class Car {
    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [Brand: " + brand + ", Model: " + model + ", Color: " + color + "]";
    }
}

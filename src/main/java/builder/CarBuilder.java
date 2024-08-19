package builder;

public class CarBuilder implements Builder {
    private String brand;
    private String model;
    private String color;

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(brand, model, color);
    }
}

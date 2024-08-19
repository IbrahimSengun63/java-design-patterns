package builder;

public interface Builder {
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Car build();  // Method to return the final constructed object
}
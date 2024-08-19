package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder carBuilder = new CarBuilder();
        director.buildBugatti(carBuilder);
        Car bugatti = carBuilder.build();
        System.out.println(bugatti);

        carBuilder = new CarBuilder();  // Reset the builder
        director.buildLambo(carBuilder);
        Car lambo = carBuilder.build();
        System.out.println(lambo);
    }
}
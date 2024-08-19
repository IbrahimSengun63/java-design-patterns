package builder;

public class Director {

    public void buildBugatti(Builder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .model("Chiron");  // Realistic model name
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .color("Yellow")
                .model("Aventador");  // Realistic model name
    }
}


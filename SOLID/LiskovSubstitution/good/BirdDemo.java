package LowLevelDesign.SOLID.LiskovSubstitution.good;

public class BirdDemo {
    public static void demonstrateFlyingBird(FlyingBird bird) {
        bird.fly();
    }

    public static void demonstrateFlightlessBird(FlightlessBird bird) {
        bird.run();
    }

    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        FlightlessBird ostrich = new Ostrich();

        demonstrateFlyingBird(sparrow);
        demonstrateFlightlessBird(ostrich);

//        demonstrateFlyingBird(ostrich);  // Compilation error, preventing misuse
    }
}

package LowLevelDesign.SOLID.LiskovSubstitution.good;

public class Ostrich implements FlightlessBird {
    @Override
    public void run() {
        System.out.println("Ostrich running...");
    }
}

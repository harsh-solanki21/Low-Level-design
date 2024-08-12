package LowLevelDesign.SOLID.LiskovSubstitution.good;

public class Sparrow implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

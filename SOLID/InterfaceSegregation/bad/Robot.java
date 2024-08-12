package LowLevelDesign.SOLID.InterfaceSegregation.bad;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        // Robots don't eat, but forced to implement this method
        throw new UnsupportedOperationException("Robots don't eat");
    }

    @Override
    public void sleep() {
        // Robots don't sleep, but forced to implement this method
        throw new UnsupportedOperationException("Robots don't sleep");
    }
}

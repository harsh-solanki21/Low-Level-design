package LowLevelDesign.SOLID.DependencyInversion.good;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan started...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan stopped...");
    }
}

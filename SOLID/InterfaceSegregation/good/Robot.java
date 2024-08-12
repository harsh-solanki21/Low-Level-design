package LowLevelDesign.SOLID.InterfaceSegregation.good;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot working");
    }
}

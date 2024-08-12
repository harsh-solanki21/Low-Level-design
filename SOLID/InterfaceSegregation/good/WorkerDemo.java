package LowLevelDesign.SOLID.InterfaceSegregation.good;

public class WorkerDemo {
    public static void main(String[] args) {
        Workable human = new Human();
        Workable robot = new Robot();

        human.work();
        robot.work();

//        human.eat();  // compilation error
//        We can only access the methods defined in the "Workable" interface.
    }
}

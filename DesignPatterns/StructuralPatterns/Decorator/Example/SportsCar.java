package LowLevelDesign.DesignPatterns.StructuralPatterns.Decorator.Example;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding features of Sports Car.");
    }

}

package LowLevelDesign.DesignPatterns.StructuralPatterns.Decorator.Example;

public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }


}

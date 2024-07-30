package LowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactory.Example;

// Concrete Product - MacButton

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button");
    }
}

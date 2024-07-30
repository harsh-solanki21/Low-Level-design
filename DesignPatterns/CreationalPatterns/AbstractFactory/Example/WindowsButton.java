package LowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactory.Example;

// Concrete Product - WindowsButton

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button");
    }
}

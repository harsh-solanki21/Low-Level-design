package LowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactory.Example;

// Concrete Product - MacCheckbox

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Mac checkbox");
    }
}

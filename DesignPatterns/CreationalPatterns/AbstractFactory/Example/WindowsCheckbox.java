package LowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactory.Example;

// Concrete Product - WindowsCheckbox

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox");
    }
}

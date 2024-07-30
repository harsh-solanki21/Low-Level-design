package LowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactory.Example;

// Concrete Factory - WindowsFactory

public class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

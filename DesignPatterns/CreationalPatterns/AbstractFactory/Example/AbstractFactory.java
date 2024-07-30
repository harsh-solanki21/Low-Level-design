package LowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactory.Example;

public interface AbstractFactory {
    Button createButton();

    Checkbox createCheckbox();
}

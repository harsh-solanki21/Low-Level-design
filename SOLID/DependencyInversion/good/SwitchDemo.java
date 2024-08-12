package LowLevelDesign.SOLID.DependencyInversion.good;

public class SwitchDemo {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        ElectricPowerSwitch bulbPowerSwitch = new ElectricPowerSwitch(bulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable fan = new Fan();
        ElectricPowerSwitch fanPowerSwitch = new ElectricPowerSwitch(fan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}

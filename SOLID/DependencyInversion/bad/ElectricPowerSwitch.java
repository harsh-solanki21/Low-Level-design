package LowLevelDesign.SOLID.DependencyInversion.bad;

public class ElectricPowerSwitch {
    private LightBulb bulb;
    private boolean on;

    public ElectricPowerSwitch(LightBulb bulb) {
        this.bulb = bulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        if (this.on) {
            bulb.turnOff();
            this.on = false;
        } else {
            bulb.turnOn();
            this.on = true;
        }
    }
}

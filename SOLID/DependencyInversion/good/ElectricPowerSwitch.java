package LowLevelDesign.SOLID.DependencyInversion.good;

public class ElectricPowerSwitch {
    private Switchable device;
    private boolean on;

    public ElectricPowerSwitch(Switchable device) {
        this.device = device;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        if (this.on) {
            device.turnOff();
            this.on = false;
        } else {
            device.turnOn();
            this.on = true;
        }
    }
}

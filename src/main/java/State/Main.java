package State;

/**
 * @author Remigiusz Zudzin
 */
public class Main {


    public static void changeLightStatus(LightSwitch lightSwitch) {
        if (lightSwitch instanceof LightOn) {
            lightSwitch = new LightOff();
            lightSwitch.switchLight();
        }
        else if (lightSwitch instanceof LightOff) {
            lightSwitch = new LightOn();
            lightSwitch.switchLight();
        }
    }

    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightOn();
        changeLightStatus(lightSwitch);


    }

}

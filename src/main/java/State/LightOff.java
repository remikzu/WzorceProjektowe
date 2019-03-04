package State;

/**
 * @author Remigiusz Zudzin
 */
public class LightOff implements LightSwitch {

    @Override
    public void switchLight() {
        System.out.println("off");
    }
}

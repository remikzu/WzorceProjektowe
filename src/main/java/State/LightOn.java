package State;

/**
 * @author Remigiusz Zudzin
 */
public class LightOn implements LightSwitch {

    @Override
    public void switchLight() {
        System.out.println("on");
    }
}

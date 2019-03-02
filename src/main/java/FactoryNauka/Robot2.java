package FactoryNauka;

/**
 * @author Remigiusz Zudzin
 */
public class Robot2 implements Robot {
    @Override
    public String getEyeColour() {
        return "green";
    }

    @Override
    public int getHeight() {
        return 160;
    }

    @Override
    public int getWeight() {
        return 60;
    }
}

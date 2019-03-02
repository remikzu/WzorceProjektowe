package FactoryNauka;

/**
 * @author Remigiusz Zudzin
 */
public class Robot1 implements Robot {
    @Override
    public String getEyeColour() {
        return "blue";
    }

    @Override
    public int getHeight() {
        return 150;
    }

    @Override
    public int getWeight() {
        return 50;
    }
}

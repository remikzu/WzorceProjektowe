package FactoryNauka;

/**
 * @author Remigiusz Zudzin
 */
public class Robot3 implements Robot {
    @Override
    public String getEyeColour() {
        return "brown";
    }

    @Override
    public int getHeight() {
        return 170;
    }

    @Override
    public int getWeight() {
        return 70;
    }
}

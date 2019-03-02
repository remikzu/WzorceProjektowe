package Factory;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class Car2 implements Car {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(2000);
    }

    @Override
    public int getMaxSpeed() {
        return 150;
    }
}

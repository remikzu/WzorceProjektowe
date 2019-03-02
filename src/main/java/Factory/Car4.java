package Factory;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class Car4 implements Car {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(4000);
    }

    @Override
    public int getMaxSpeed() {
        return 250;
    }
}

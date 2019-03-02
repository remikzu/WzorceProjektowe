package Factory;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class Car1 implements Car {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(1000);
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }
}

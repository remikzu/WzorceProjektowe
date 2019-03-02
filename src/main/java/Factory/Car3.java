package Factory;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class Car3 implements Car {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(3000);
    }

    @Override
    public int getMaxSpeed() {
        return 200;
    }
}

package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class Truck implements Car {

    private BigDecimal price = BigDecimal.valueOf(10000);
    private int speed = 50;

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public BigDecimal price() {
        return price;
    }

    @Override
    public BigDecimal getPrice() {
        return price();
    }
}

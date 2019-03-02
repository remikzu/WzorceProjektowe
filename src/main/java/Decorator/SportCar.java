package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class SportCar implements Car {

    private int speed = 100;
    private BigDecimal price = BigDecimal.valueOf(5000);


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

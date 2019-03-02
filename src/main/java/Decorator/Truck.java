package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class Truck implements Car {

    private int price = 10000;
    private int speed = 50;

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public int getPrice() {
        return price();
    }
}

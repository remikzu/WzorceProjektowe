package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class SportCar implements Car {

    private int speed = 100;
    private int price = 5000;


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

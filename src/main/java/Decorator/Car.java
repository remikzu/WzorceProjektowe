package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public interface Car {

    int getMaxSpeed();
    int price();

    default void writeSpeed() {
        System.out.println("Predkosc to: " + getMaxSpeed());
    }

    int getPrice();
}

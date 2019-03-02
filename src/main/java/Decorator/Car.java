package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public interface Car {

    int getMaxSpeed();
    BigDecimal price();

    default void writeSpeed() {
        System.out.println("Predkosc to: " + getMaxSpeed());
    }

    BigDecimal getPrice(
    );
}

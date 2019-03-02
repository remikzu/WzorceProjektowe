package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public abstract class CarDecorator {

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public int getMaxSpeed() {
        return car.getMaxSpeed();
    }

    public int getPrice() {
        return car.getPrice();
    }

    public void writeSpeed() {
        car.writeSpeed();
    }

}

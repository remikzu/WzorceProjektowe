package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class NitroCarDecorator extends CarDecorator {

    public NitroCarDecorator(Car car) {
        super(car);
    }

    public void useNitro() {
        System.out.println("Predkosc to: " + (car.getMaxSpeed()+100));
    }
}

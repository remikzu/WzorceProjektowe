package Decorator;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class DecreasePriceDecorator extends CarDecorator {

    public DecreasePriceDecorator(Car car) {
        super(car);
    }

    public void reducePrice(int reduce) {
        System.out.println("Cena to: " + (car.getPrice()-reduce));
    }
}

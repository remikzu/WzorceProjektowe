package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Remigiusz Zudzin
 */
class NitroCarDecoratorTest {

    @Test
    void useNitro() {
        Car car = new SportCar();
        Car car2 = new Truck();
    }

}
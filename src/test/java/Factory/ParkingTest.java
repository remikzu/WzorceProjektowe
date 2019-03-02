package Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Remigiusz Zudzin
 */
class ParkingTest {

    Parking parking = new Parking();
    @Test
    void testCarsMaxSpeed() {
        Assertions.assertEquals(100, parking.car1.getMaxSpeed());
        Assertions.assertEquals(150, parking.car2.getMaxSpeed());
        Assertions.assertEquals(200, parking.car3.getMaxSpeed());
        Assertions.assertEquals(250, parking.car4.getMaxSpeed());
    }

    @Test
    void testCarsPrice() {
        Assertions.assertEquals(BigDecimal.valueOf(1000), parking.car1.getPrice());
        Assertions.assertEquals(BigDecimal.valueOf(2000), parking.car2.getPrice());
        Assertions.assertEquals(BigDecimal.valueOf(3000), parking.car3.getPrice());
        Assertions.assertEquals(BigDecimal.valueOf(4000), parking.car4.getPrice());
    }

}
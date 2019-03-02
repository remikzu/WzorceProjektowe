package Factory;

/**
 * @author Remigiusz Zudzin
 */
public class CarFactory {

    public static Car createCar(CarModel model) {
        if (CarModel.Car1.equals(model)) {
            return new Car1();
        } else if (CarModel.Car2.equals(model)) {
            return new Car2();
        } else if (CarModel.Car3.equals(model)) {
            return new Car3();
        } else if (CarModel.Car4.equals(model)) {
            return new Car4();
        }
        return null;
    }
}

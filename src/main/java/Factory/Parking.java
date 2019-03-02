package Factory;

/**
 * @author Remigiusz Zudzin
 */
public class Parking {

    Car car1 = CarFactory.createCar(CarModel.Car1);
    Car car2 = CarFactory.createCar(CarModel.Car2);
    Car car3 = CarFactory.createCar(CarModel.Car3);
    Car car4 = CarFactory.createCar(CarModel.Car4);

    void runCar() {
        System.out.println(car1.getMaxSpeed());
        System.out.println(car1.getPrice());
        System.out.println(car2.getMaxSpeed());
        System.out.println(car2.getPrice());
    }

}

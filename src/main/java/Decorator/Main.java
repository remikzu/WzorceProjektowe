package Decorator;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {
        Car car = new SportCar();
        Car car2 = new Truck();

        car.writeSpeed();
        NitroCarDecorator carDecorator = new NitroCarDecorator(car);
        car.writeSpeed();
        carDecorator.useNitro();
    }

}

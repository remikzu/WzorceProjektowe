package Decorator;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {
        Car car = new SportCar();
        Car car2 = new Truck();
        Car car3 = new SportCar();

        car.writeSpeed();
        NitroCarDecorator carDecorator = new NitroCarDecorator(car);
        car.writeSpeed();
        carDecorator.useNitro();

        System.out.println("Cena to: " + car2.getPrice());
        DecreasePriceDecorator carPriceReduction = new DecreasePriceDecorator(car2);
        System.out.println("Cena to: " + car2.getPrice());
        carPriceReduction.reducePrice(200);
    }

}

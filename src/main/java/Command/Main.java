package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(cow);
        for (Animal animal : list) {
            animal.execute();
        }

    }

}

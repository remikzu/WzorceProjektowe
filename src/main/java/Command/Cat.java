package Command;

/**
 * @author Remigiusz Zudzin
 */
public class Cat implements Animal {

    void Meow() {
        System.out.println("Meow!");
    }

    @Override
    public void execute() {
        Meow();
    }
}

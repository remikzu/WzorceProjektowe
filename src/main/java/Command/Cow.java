package Command;

/**
 * @author Remigiusz Zudzin
 */
public class Cow implements Animal{

    void Muuu() {
        System.out.println("Muuuu!");
    }

    @Override
    public void execute() {
        Muuu();
    }
}

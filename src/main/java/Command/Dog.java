package Command;

/**
 * @author Remigiusz Zudzin
 */
public class Dog implements Animal{

    void Hau() {
        System.out.println("hau hau hau");
    }

    @Override
    public void execute() {
        Hau();
    }
}

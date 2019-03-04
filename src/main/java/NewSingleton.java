/**
 * @author Remigiusz Zudzin
 */
public class NewSingleton {

    private static NewSingleton instance;

    private NewSingleton() {
    }

    public static NewSingleton getInstance() {
        if (instance == null) {
            instance = new NewSingleton();
        }
        return instance;
    }
}

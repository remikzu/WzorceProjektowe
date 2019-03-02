package Factory.TestClassesCreatingNewObjectFromEachOther;

/**
 * @author Remigiusz Zudzin
 */
public class SecondClass {

    static FirstClass createFirstClassObject() {
        return new FirstClass();
    }

    static SecondClass createSecondClassObject() {
        return new SecondClass();
    }

    public static void main(String[] args) {
        SecondClass newObject = createSecondClassObject();
        FirstClass newObject2 = createFirstClassObject();
    }

}

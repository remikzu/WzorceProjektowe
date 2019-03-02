import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Remigiusz Zudzin
 */
class SingletonTest {

    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    @Test
    void isCreatingSingletonCorrect() throws IllegalAccessException, InvocationTargetException, InstantiationException {

            assertTrue(singleton == singleton2);
            Constructor<?>[] declaredConstructiors = Singleton.class.getDeclaredConstructors();
            declaredConstructiors[0].setAccessible(true);
            Singleton s = (Singleton) declaredConstructiors[0].newInstance();
            assertTrue(s == singleton);
        }
    }
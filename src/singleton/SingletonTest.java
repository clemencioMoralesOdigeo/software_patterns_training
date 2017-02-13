package singleton;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Clemencio Morales Lucas.
 */
public class SingletonTest {

    @Test
    public void testOnlyOneSingletonExists() throws Exception {
        Singleton singleton = Singleton.getInstance();
        Singleton otherSingletonInstance = Singleton.getInstance();
        System.out.println("singleton: "+singleton);
        System.out.println("otherSing: "+otherSingletonInstance);
        assertEquals(singleton, otherSingletonInstance);
    }

}



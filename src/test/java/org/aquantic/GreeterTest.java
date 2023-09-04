package org.aquantic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        String result = greeter.sayHello();
        assertNotNull(result, "The result should not be null");
        assertEquals("Hello World from Greeter !", result, "The greeting message is not as expected");
    }
}

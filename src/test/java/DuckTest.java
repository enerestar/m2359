import com.m2359.Duck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {
    @Test
    void quack() {
        Duck duck = new Duck();
        assertEquals("I can swim", duck.swim());
        assertEquals("Quack, quack", duck.getSound());
    }
}

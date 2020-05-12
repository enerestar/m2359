import com.m2359.Bird;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {
    @Test
    void sing() {
        Bird bird = new Bird();
        String sing = "I can sing";
        assertEquals(sing, bird.sing());
    }
}

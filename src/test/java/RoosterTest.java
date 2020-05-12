import com.m2359.chicken.Rooster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoosterTest {

    @Test
    void sound() {
        Rooster rooster = new Rooster();
        assertEquals("Cock-a-doodle-do", rooster.getSound());
    }
}

import com.m2359.chicken.Rooster;
import com.m2359.utils.Messages;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoosterTest {

    @Test
    void sound() {
        Rooster rooster = new Rooster();
        System.out.println(rooster.getSound());
        assertEquals(Messages.getMessages().cock_a_doodle_do, rooster.getSound());
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.main.Train;

public class TrainTest {
    private Train train;

    @BeforeEach
    void setUp() {
        train = new Train();
        train.addBogie("Sleeper");
        train.addBogie("AC Chair");
        train.addBogie("First Class");
    }

    @Test
    void testAddBogie() {
        train.addBogie("Second Class");
        assertTrue(train.getBogies().contains("Second Class"));
    }

    @Test
    void testRemoveBogie() {
        train.removeBogie("AC Chair");
        assertFalse(train.getBogies().contains("AC Chair"));
    }

    @Test
    void testHasBogie() {
        assertTrue(train.hasBogie("Sleeper"));
        assertFalse(train.hasBogie("Luxury"));
    }

    @Test
    void testBogiesListSize() {
        assertEquals(3, train.getBogies().size()); // after setup
    }
}

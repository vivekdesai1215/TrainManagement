import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.trainmanagement.TrainLinkedHashSet;

import java.util.*;

public class TrainLinkedHashSetTest {
    private TrainLinkedHashSet train;

    @BeforeEach
    void setUp() {
        train = new TrainLinkedHashSet();
        train.addBogie("Engine");
        train.addBogie("Sleeper");
        train.addBogie("AC");
        train.addBogie("Cargo");
        train.addBogie("Guard");
    }

    @Test
    void testInsertionOrder() {
        List<String> bogies = new ArrayList<>(train.getBogies());
        assertEquals("Engine", bogies.get(0));
        assertEquals("Guard", bogies.get(4));
    }

    @Test
    void testNoDuplicates() {
        int initialSize = train.getBogies().size();
        train.addBogie("Sleeper"); // duplicate
        assertEquals(initialSize, train.getBogies().size(),
            "LinkedHashSet should not allow duplicate bogies");
    }

    @Test
    void testHasBogie() {
        assertTrue(train.hasBogie("AC"));
        assertFalse(train.hasBogie("Pantry Car"));
    }
}

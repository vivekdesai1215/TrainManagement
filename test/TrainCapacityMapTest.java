import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.trainmanagement.TrainCapacityMap;

public class TrainCapacityMapTest {
    private TrainCapacityMap train;

    @BeforeEach
    void setUp() {
        train = new TrainCapacityMap();
        train.addBogie("Engine", 2);
        train.addBogie("First Class", 50);
        train.addBogie("Second Class", 100);
        train.addBogie("Third Class", 150);
        train.addBogie("Sleeper", 240);
    }

    @Test
    void testCapacityRetrieval() {
        assertEquals(50, train.getCapacity("First Class"));
        assertEquals(240, train.getCapacity("Sleeper"));
    }

    @Test
    void testHasBogie() {
        assertTrue(train.hasBogie("Engine"));
        assertFalse(train.hasBogie("Pantry Car"));
    }

    @Test
    void testUpdateCapacity() {
        train.addBogie("Sleeper", 300); // overwrite
        assertEquals(300, train.getCapacity("Sleeper"));
    }

    @Test
    void testMapSize() {
        assertEquals(5, train.getAllBogies().size());
    }
}

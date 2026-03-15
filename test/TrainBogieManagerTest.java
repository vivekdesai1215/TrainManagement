import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.trainmanagement.TrainBogieManager;

public class TrainBogieManagerTest {
    private TrainBogieManager manager;

    @BeforeEach
    void setUp() {
        manager = new TrainBogieManager();
        manager.addBogie("BG101");
        manager.addBogie("BG102");
        manager.addBogie("BG103");
    }

    @Test
    void testAddUniqueBogies() {
        manager.addBogie("BG105");
        assertTrue(manager.getBogies().contains("BG105"));
    }

    @Test
    void testRejectDuplicateBogies() {
        int initialSize = manager.getBogies().size();
        manager.addBogie("BG101"); // duplicate
        assertEquals(initialSize, manager.getBogies().size(), 
            "HashSet should not allow duplicate bogie IDs");
    }

    @Test
    void testHasBogie() {
        assertTrue(manager.hasBogie("BG102"));
        assertFalse(manager.hasBogie("BG999"));
    }
}

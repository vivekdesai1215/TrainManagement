import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.trainmanagement.Bogie;
import com.trainmanagement.BogieFilter;

import java.util.*;

public class BogieFilterTest {
    private List<Bogie> bogies;
    private BogieFilter filter;

    @BeforeEach
    void setUp() {
        filter = new BogieFilter();
        bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
    }

    @Test
    void testFilterByCapacityGreaterThan60() {
        List<Bogie> result = filter.filterByCapacity(bogies, 60);

        // Should contain Sleeper (72) and General (90)
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(b -> b.getName().equals("Sleeper")));
        assertTrue(result.stream().anyMatch(b -> b.getName().equals("General")));
    }

    @Test
    void testFilterEmptyResult() {
        List<Bogie> result = filter.filterByCapacity(bogies, 100);
        assertTrue(result.isEmpty(), "No bogies should have capacity > 100");
    }

    @Test
    void testFilterAllBogies() {
        List<Bogie> result = filter.filterByCapacity(bogies, 10);
        assertEquals(4, result.size(), "All bogies should be included");
    }
}

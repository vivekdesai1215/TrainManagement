import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.trainmanagement.Bogie;
import com.trainmanagement.BogieSorter;

import java.util.*;

public class BogieSorterTest {
    private List<Bogie> bogies;
    private BogieSorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new BogieSorter();
        bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
    }

    @Test
    void testSortingByCapacity() {
        List<Bogie> sorted = sorter.sortByCapacity(bogies);

        // Check order by capacity ascending
        assertEquals("First Class", sorted.get(0).getName());
        assertEquals("AC Chair", sorted.get(1).getName());
        assertEquals("Sleeper", sorted.get(2).getName());
        assertEquals("General", sorted.get(3).getName());
    }

    @Test
    void testSmallestCapacityFirst() {
        List<Bogie> sorted = sorter.sortByCapacity(bogies);
        assertEquals(24, sorted.get(0).getCapacity());
    }

    @Test
    void testLargestCapacityLast() {
        List<Bogie> sorted = sorter.sortByCapacity(bogies);
        assertEquals(90, sorted.get(sorted.size() - 1).getCapacity());
    }
}

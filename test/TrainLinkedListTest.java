import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.trainmanagement.TrainLinkedList;


public class TrainLinkedListTest {
    private TrainLinkedList train;

    @BeforeEach
    void setUp() {
        train = new TrainLinkedList();
        train.addBogie("Engine");
        train.addBogie("Sleeper");
        train.addBogie("AC");
        train.addBogie("Cargo");
        train.addBogie("Guard");
    }

    @Test
    void testInsertionOrder() {
        assertEquals("Engine", train.getBogies().get(0));
        assertEquals("Guard", train.getBogies().get(4));
    }

    @Test
    void testInsertAtPosition() {
        train.insertBogieAt(2, "Pantry Car");
        assertEquals("Pantry Car", train.getBogies().get(2));
    }

    @Test
    void testRemoveFirstAndLast() {
        train.removeFirstBogie();
        train.removeLastBogie();
        assertFalse(train.getBogies().contains("Engine"));
        assertFalse(train.getBogies().contains("Guard"));
    }

    @Test
    void testSizeAfterOperations() {
        train.insertBogieAt(2, "Pantry Car");
        train.removeFirstBogie();
        train.removeLastBogie();
        assertEquals(4, train.getBogies().size());
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {
    @Test
    public void test(){
        MoviesManager manager = new MoviesManager(10);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
        
    }

}

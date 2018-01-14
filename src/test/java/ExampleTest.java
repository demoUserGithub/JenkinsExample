import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    @Test
    void add() {
        Example example = new Example();
        for(int i=0; i<10; i++)
            assertEquals(1+i, example.add(1,i));
    }

}
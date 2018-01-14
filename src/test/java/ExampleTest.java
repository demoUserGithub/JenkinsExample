import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleTest {
    @Test
    public void add() throws Exception {
        Example example = new Example();
        for(int i=0; i<10; i++)
            assertEquals(1+i, example.add(1,i));
    }

}
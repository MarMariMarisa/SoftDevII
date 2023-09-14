package unit01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IteractiveFibTest {
    @Test
    public void fibTest(){
         //setup
         int n = 10;
         int expected = 34;
         //invoke
         int actual = InteractiveFib.fib(n);
         //assert
         assertEquals(expected,actual,0.00001);
     } 
}

package unit01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import unit01.hwAssignments.Log;

public class LogTest {
    @Test
    public void logRandomCase(){
         //setup
         int base = 2;
         double n = 10;
         int expected = 3;
         //invoke
         int actual = Log.log(base, n);
         //assert
         assertEquals(expected,actual,0.00001);
     } 
     public void logLessThanOne(){
        //setup
        int base = 2;
        double n = 0;
        int expected = -1;
        //invoke
        int actual = Log.log(base, n);
        //assert
        assertEquals(expected,actual,0.00001);
    }
    public void logLargeNum(){
        //setup
        int base = 10;
        double n = 1000001;
        int expected = 6;
        //invoke
        int actual = Log.log(base, n);
        //assert
        assertEquals(expected,actual,0.00001);
    } 
}

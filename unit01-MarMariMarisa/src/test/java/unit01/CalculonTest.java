package unit01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class CalculonTest {
    @Test
    public void add(){
        //setup
        float x = 1.2F;
        float y = 3.4F;
        float expected = x+y;
        //invoke
        float actual = Calculon.add(x,y);
        //assert
        assertEquals(expected, actual);
    }
    @Test
    public void divide(){
         //setup
         float x = 1.2F;
         float y = 3.4F;
         float expected = x/y;
         //invoke
         float actual = Calculon.divide(x,y);
         //assert
         assertEquals(expected,actual,0.00001);
     }   
    
    }


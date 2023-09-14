package unitXX;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapesTest {
    @Test
    public void testEquality() {
        //setup
        Triangle triangleOne = new Triangle("Triangle",5,5);
        Triangle triangleTwo = new Triangle("Triangle",5,5);
        Triangle triangleThree = new Triangle("Tri",5,5);

        Boolean expectedOne = true;
        Boolean expectedTwo = false;
        //invoke
        Boolean actualOne = triangleOne.equals(triangleTwo);
        Boolean actualTwo = triangleOne.equals(triangleThree);
        //analyze
        assertEquals(expectedOne,actualOne );
        assertEquals(expectedTwo,actualTwo );
    }    
}
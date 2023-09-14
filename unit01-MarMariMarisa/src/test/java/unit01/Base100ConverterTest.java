package unit01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit01.hwAssignments.Base100Converter;

public class Base100ConverterTest {
    @Test
    public void convertTest(){
         //setup
         char x = '5';
         int expected = 5;

         char y = '9';
         int expectedTwo = 9;
         //invoke
         int actual = Base100Converter.charToInteger(x);
         int actualTwo = Base100Converter.charToInteger(y);
         //assert
         //assert
         assertEquals(expected, actual);
         assertEquals(expectedTwo, actualTwo);
     } 
     @Test
     public void ArrayToIntTestBase10(){
        //setup
        char[] anArray = {'5','4','6','7'};
        int expectedOne = 5467;
        int expectedTwo = 7645;

        int base = 10;

        //invoke
        int actual = Base100Converter.arrayToInteger(anArray,base, true);
        int actualTwo = Base100Converter.arrayToInteger(anArray,base, false);

        //assert
        assertEquals(expectedOne, actual);
        assertEquals(expectedTwo, actualTwo);

     }
     @Test
     public void ArrayToIntTestBase8(){
        //setup
        char[] anArray = {'5','4','6','7'};
        int expectedOne = 2871;
        int expectedTwo = 4005;

        int base = 8;

        //invoke
        int actual = Base100Converter.arrayToInteger(anArray,base, true);
        int actualTwo = Base100Converter.arrayToInteger(anArray,base, false);

        //assert
        assertEquals(expectedOne, actual);
        assertEquals(expectedTwo, actualTwo);

     }
     @Test
     public void ArrayToIntTestBase2(){
        //setup
        char[] anArray = {'1','0','1','1'};
        int expectedOne = 11;
        int expectedTwo = 13;

        int base = 2;

        //invoke
        int actual = Base100Converter.arrayToInteger(anArray,base, true);
        int actualTwo = Base100Converter.arrayToInteger(anArray,base, false);

        //assert
        assertEquals(expectedOne, actual);
        assertEquals(expectedTwo, actualTwo);

     }
}

package unit05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import unit05.mcf.LinkedList;
public class LinkedListTest {
    @Test
    public void appendToEmptyTest() {
        //Setup
        LinkedList<Integer> listOne = new LinkedList<Integer>();
        LinkedList<Integer> listTwo = new LinkedList<Integer>();
        LinkedList<Integer> listThree = new LinkedList<Integer>();
        listOne.append(1);
        listOne.append(2);
        listTwo.append(1);
        listTwo.append(2);
        int expectedOne = 1;
        int expectedTwo = 2;
        boolean expectedThree = true;
        boolean expectedFour = false;
        
        //Invoke
        int actualOne = listOne.get(0);
        int actualTwo = listOne.get(1);
        boolean actualThree = listOne.equals(listTwo);
        boolean actualFour = listOne.equals(listThree);

        //Analyze
        assertEquals(expectedOne,actualOne);
        assertEquals(expectedTwo,actualTwo);
        assertEquals(expectedThree,actualThree);
        assertEquals(actualFour,expectedFour);
        assertThrows(IndexOutOfBoundsException.class,()-> listOne.get(5));
    }
    public void appendToFromList() {
        //Setup
        LinkedList<Integer> listTestOne = new LinkedList<Integer>();
        LinkedList<Integer> listTestTwo = new LinkedList<Integer>();
        LinkedList<Integer> listTestThree = new LinkedList<Integer>();
        listTestOne.append(1);
        listTestOne.append(2);
        listTestTwo.append(1);
        listTestTwo.append(2);

        LinkedList<Integer> listOne = new LinkedList<Integer>(listTestOne);
        LinkedList<Integer> listTwo = new LinkedList<Integer>(listTestTwo);
        LinkedList<Integer> listThree = new LinkedList<Integer>(listTestThree);

        int expectedOne = 1;
        int expectedTwo = 2;
        boolean expectedThree = true;
        boolean expectedFour = false;
        
        //Invoke
        int actualOne = listOne.get(0);
        int actualTwo = listOne.get(1);
        boolean actualThree = listOne.equals(listTwo);
        boolean actualFour = listOne.equals(listThree);

        //Analyze
        assertEquals(expectedOne,actualOne);
        assertEquals(expectedTwo,actualTwo);
        assertEquals(expectedThree,actualThree);
        assertEquals(actualFour,expectedFour);
        assertThrows(IndexOutOfBoundsException.class,()-> listOne.get(5));
    }
}

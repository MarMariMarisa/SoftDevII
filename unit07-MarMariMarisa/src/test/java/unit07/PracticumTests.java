package unit07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit07.practicum.HeapPQ;
import unit07.practicum.ListPQ;

public class PracticumTests {
    @Test
    public void practicumTests() {
        HeapPQ heapPq = new HeapPQ();
        heapPq.enqueue(10);
        heapPq.enqueue(8);
        heapPq.enqueue(36);

        int expected = 8;
        int actual = heapPq.dequeue();

        ListPQ listPq = new ListPQ();
        listPq.enqueue(10);
        listPq.enqueue(8);
        listPq.enqueue(26);

        int actualTwo = listPq.dequeue();

        assertEquals(expected, actual);
        assertEquals(expected, actualTwo);

        heapPq.enqueue(4);
        listPq.enqueue(4);

        int expectedTwo = 4;
        int actualThree = heapPq.dequeue();
        int actualFour = listPq.dequeue();

        assertEquals(expectedTwo, actualThree);
        assertEquals(expectedTwo, actualFour);

    }
}

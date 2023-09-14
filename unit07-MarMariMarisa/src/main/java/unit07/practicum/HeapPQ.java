package unit07.practicum;

import java.util.Arrays;

public class HeapPQ implements Queue<Integer>{
    private Heap arrayHeap;

    public HeapPQ(){
        arrayHeap = new ArrayHeap();
    }
    @Override
    public void enqueue(Integer value){
        arrayHeap.add(value);
    }
    @Override
    public Integer dequeue(){
        return arrayHeap.remove(); //highest priority elt, min elements
    }
    @Override
    public int size(){
        return arrayHeap.size();
    }
    
}

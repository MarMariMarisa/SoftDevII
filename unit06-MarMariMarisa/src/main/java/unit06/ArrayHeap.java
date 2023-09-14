package unit06;

import java.util.Arrays;

public class ArrayHeap implements Heap {
    private int[] array;
    private int size;
    public ArrayHeap(){
        array = new int[5];
        size = 0;
    }
    private void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    @Override
    public void add(int value){
        if(size == array.length){
            array = Arrays.copyOf(array, array.length *2);
        }
        array[size] = value;

        int parent = (size-1)/2;
        int child = size;
        while(array[parent] > array[child]){
            swap(parent,child);
            int temp = parent;
            parent = child;
            child = temp;
        }
        size++;
    }
    @Override
    public int remove(){
        int rootValue = array[0];
        size--;
        array[0] = array[size];
        array[size] = 0;

        int parent = 0;
        while(true){
            int left = 2*parent+1;
            int right = 2*parent+2;
            if(left>= size){
                break;
            }
            int minChild = left;
            if(right<size && array[right] < array[left]){
                minChild = right;
            }
            if(array[parent] > array[minChild]){
                swap(parent,minChild);
                parent = minChild;
            }
            else{
                break;
            }
        }
        return rootValue;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        return Arrays.toString(array) + ", " + size;
    }

    public static void main(String[] args){
        Heap heap = new ArrayHeap();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
    }
}

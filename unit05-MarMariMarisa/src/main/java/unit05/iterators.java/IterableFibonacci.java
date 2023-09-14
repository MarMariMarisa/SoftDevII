package unit05.iterators.java;

import java.util.ArrayList;

public class IterableFibonacci implements Iterable<Long> {
    private ArrayList<Long> arrayList;
    public IterableFibonacci(long a, long b) {
           arrayList = new ArrayList<>();
           arrayList.add(a);
           arrayList.add(b);
     }
     public void add() {
           int size = arrayList.size();
           long a = arrayList.get(size- 2);
           long b = arrayList.get(size- 1);
           arrayList.add(a + b);
    }
    public Long get(int index) {
           return arrayList.get(index);
    }
    public int length() {
         return arrayList.size();
    }
    @Override
    public String toString(){
        String a = "[]";
        for(int i = 0; i < arrayList.size(); i++){
            if(i != arrayList.size() -2){
                a+= get(i) + ", ";
            }else{
                a+= get(i) + "]";
            }
        }
    }
    @Override
    public Iterator<Long> iterator() {
         return new FibonacciIterator(arrayList);
    }
}


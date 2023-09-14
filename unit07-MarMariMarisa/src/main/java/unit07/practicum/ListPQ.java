package unit07.practicum;

import java.util.LinkedList;
import java.util.List;

public class ListPQ implements Queue<Integer> {
        List<Integer> list;
        public ListPQ(){
            list = new LinkedList<>();
        }
        @Override
        public void enqueue(Integer value){
            list.add(value);
        }
        @Override
        public Integer dequeue(){ //rmeove min elt only
            int minElt = list.get(0);
            int minIndex = 0;
            for(int i = 0; i < list.size();i++){
                    if(list.get(i) < minElt){
                        minElt = list.get(i);
                        minIndex = i;
                    }
            }
            return list.remove(minIndex);
        }
        @Override
        public int size(){
            return list.size();
        }
}

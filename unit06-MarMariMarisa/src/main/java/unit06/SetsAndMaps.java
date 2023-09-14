package unit06;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetsAndMaps {
    public static void hashSet(){
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Apple");//ignored
        System.out.println(set.contains("Orange"));
        for(String elt : set){
            System.out.println(elt);
        }
    }
    public static void treeSet(){
        Set<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Apple");//ignored
        for(String elt : set){
            System.out.println(elt);
        }
    }

    public static void hashMap(){ // same as pythons dictionary
        Map<String, Integer> map = new HashMap<>(); 
        map.put("Apple",2);
        map.put("Orange",5);
        map.put("Banana",3);
        map.put("Orange",3);
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
        map.get("Banana");
        map.remove("Banana");
    }
    public static void priorityQueue(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Grape");
       
    }
    public static void main(String[] args){
        //treeSet();
        hashMap();
    }
}

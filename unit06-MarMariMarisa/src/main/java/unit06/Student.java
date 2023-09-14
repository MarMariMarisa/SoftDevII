package unit06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Student implements Comparable<Student> {
    private String name;
    private int number;

    public Student(int number,String name){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    @Override
    public String toString(){
        return number + ": " + name;
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Student){
            Student otherStudent = (Student) other;
            return this.number == other.number && this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return number + name.hashCode();
    }
    @Override
    public int compareTo(Student other){
        return this.number - other.number;
    }
    public static void main(String[] args){
        Student st1 = new Student(123,"John");
        Student st2 = new Student(999,"Tom");
        Student st3 = new Student(456,"Marry");
        Set<Student> set  = new HashSet<>();
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(new Student(123,"John"));
        for(Student st : set){
            System.out.println(st);
        }

        Map<Integer, Student> map = new HashMap<>();
        map.put(123,st1);
        map.put(999,st2);
        map.put(456,st3);
        for(Integer key : map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }
        map.remove(999);

        Queue<Student> queue = new PriorityQueue<>();
        queue.add(st1);
        queue.add(st2);
        queue.add(st3);
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        
    }
}

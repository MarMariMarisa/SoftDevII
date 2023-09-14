package practicum2;

import java.util.Iterator;

//GRADE ME!!!s
public class IterableString implements Iterable<Character> {
    private String aString;
    private int size;


    public IterableString(String aString) {
        this.aString = aString;
        this.size = aString.length();
    }

    @Override
    public String toString() {
        return this.aString;
    }
    @Override
    public Iterator<Character> iterator(){
        return new StringIterator();
    }


    public static void main(String[] args) {
        for (char ch : new IterableString("Hi there!")) {
        System.out.println(ch);
        }
    }
    public class StringIterator implements Iterator<Character>{
        int a = 0;

        public boolean hasNext() {
            return a != size;
        }
        public Character next(){
            int current = a;
            int holder = current;
            a++;
            return aString.charAt(holder);
        }
    
    }
}



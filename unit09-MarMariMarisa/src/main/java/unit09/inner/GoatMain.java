package unit09.inner;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class GoatMain {
    public static class GoatComparator implements Comparator<Goat> {
        @Override
        public int compare(Goat g1, Goat g2){
            return g1.getName().compareTo(g1.getName());
        }
    }
    public static void main(String[] args){
        Goat g1 = new Goat("John");
        Goat g2 = new Goat("Tom");
        Goat g3 = new Goat("Mary");

        Set<Goat> set = new TreeSet<>(new GoatComparator()); //sort elements by the unnatural order
        set.add(g1);
        set.add(g2);
        set.add(g3);

        System.out.println(set);
    }
}

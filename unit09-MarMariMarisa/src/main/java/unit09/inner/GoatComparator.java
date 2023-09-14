package unit09.inner;

import java.util.Comparator;

public class GoatComparator implements Comparator<Goat> {
    @Override
    public int compare(Goat g1, Goat g2){
        return g1.getName().compareTo(g1.getName());
    }
}

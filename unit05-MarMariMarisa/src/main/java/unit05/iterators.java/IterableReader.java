package unit05.iterators.java;

import java.io.File;
import java.util.Iterator;

public class IterableReader implements Iterable<String>,Iterator<String>,AutoCloseable {
    File file;

    public IterableReader(String filename){
        file = new File(filename);
    }
}

package unit09.practicum;

import unit09.graphs.WAdjacencyGraph;

public class Word {
        public static void main(String[] args) {
            //Marisa as in myself
            WAdjacencyGraph<String> graph = new WAdjacencyGraph<>();
            graph.add("M");
            graph.add("A");
            graph.add("R");
            graph.add("I");
            graph.add("S");
            graph.add("a");
    
            
            graph.connect("M", "A", 1);
            graph.connect("A", "R", 1);
            graph.connect("R", "I", 1);
            graph.connect("I", "S", 1);
            graph.connect("S", "a", 1);
            graph.connect("a", "M", Double.POSITIVE_INFINITY);
    
           
            graph.connect("M", "R", 10);
            graph.connect("M", "I", 10);
            graph.connect("M","S",10);
            graph.connect("M","a",10);
    
            graph.connect("A", "I", 10);
            graph.connect("A","S",10);
            graph.connect("A","a",10);
    
            graph.connect("R", "S", 10);
            graph.connect("R", "a", 10);
    
            graph.connect("I", "a", 10);


            System.out.println(graph.dijkstrasPath("M", "a"));
        }
}

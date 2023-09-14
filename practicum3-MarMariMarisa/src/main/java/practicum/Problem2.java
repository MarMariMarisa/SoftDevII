package practicum;

import java.util.*;
import practicum.graphs.AdjacencyGraph;
import practicum.graphs.Graph;

public class Problem2 {
    public static List<String> findLeaders(Graph<String> graph, List<String> values) {
        // TO DO - find leaders
        List<String> toReturn = new ArrayList<>();
        for(String value : values){
            Boolean isLeader = true;
            for(String val : values){
                if(val != value){
                    if(graph.dfSearch(value, val) == false){
                        isLeader = false;
                    }
                }
            }
            if(isLeader == true){
                toReturn.add(value);
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        Graph<String> graph = new AdjacencyGraph<>();
        // TO DO - construct the graph in the SECOND example
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");

        graph.connectDirected("A", "B");
        graph.connectUndirected("A", "E");

        graph.connectDirected("B", "E");

        graph.connectDirected("C", "B");
        graph.connectDirected("C", "D");

        graph.connectDirected("D", "A");
        List<String> leaders = findLeaders(graph, Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(leaders); // A, B, E (order doesn't matter)

    }
}

package unit08.practicum;

import java.util.ArrayList;
import java.util.List;

import unit08.graphs.AdjacencyGraph;

public class Mothers {
        public static List<String> findMothers(AdjacencyGraph<String> graph, List<String> values){
            List<String> mothers = new ArrayList<>();
            boolean searching = true;
    
            for(int i = 0; i < values.size(); i++){
                for(int j = 0; j < values.size(); j++){
                    searching = graph.bfSearch(values.get(i), values.get(j));
                    if(searching == false){
                        break;
                    }
                }
                if(searching == true){
                    mothers.add(values.get(i));
                }
                searching = true;
            }
            return mothers;
    }


    public static void main(String[] args) {
       
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        AdjacencyGraph<String> graph1 = new AdjacencyGraph<>();
        graph1.add("A");
        graph1.add("B");
        graph1.add("C");
        graph1.add("D");
        graph1.add("E");

        graph1.connectDirected("A", "B");
        graph1.connectDirected("B", "E");
        graph1.connectDirected("B", "C");
        graph1.connectDirected("E", "A");
        graph1.connectDirected("C", "D");

        System.out.println(findMothers(graph1, list1));

        //graph 2 and list 2
        List<String> list2 = new ArrayList<>();
        list2.add("T");
        list2.add("U");
        list2.add("V");
        list2.add("W");
        list2.add("X");
        list2.add("Y");
        list2.add("Z");

        AdjacencyGraph<String> graph2 = new AdjacencyGraph<>();
        graph2.add("T");
        graph2.add("U");
        graph2.add("V");
        graph2.add("W");
        graph2.add("X");
        graph2.add("Y");
        graph2.add("Z");

        graph2.connectDirected("Z", "U");
        graph2.connectDirected("Z", "Y");
        graph2.connectDirected("Y", "W");
        graph2.connectDirected("Y", "X");
        graph2.connectDirected("X", "U");
        graph2.connectDirected("X", "T");
        graph2.connectDirected("W", "T");
        graph2.connectDirected("T", "V");

        System.out.println(findMothers(graph2, list2)); 
}
}

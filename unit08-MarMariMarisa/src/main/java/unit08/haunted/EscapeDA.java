package unit08.haunted;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import unit08.graphs.WAdjacencyGraph;

public class EscapeDA {
    public static WAdjacencyGraph<Area>buildGraph(Map<Area,Collection<Area>>passages) {
        WAdjacencyGraph<Area> graph = new WAdjacencyGraph<>();
        for(Area areaOne : passages.keySet() ){
            for(Area area : passages.get(areaOne)){
            if(!area.isHaunted()){
                graph.connect(areaOne, area, 1);
            }
            if(area.isHaunted()){
                graph.connect(areaOne, area, 0);
            }
        }
        }
        return graph;
    }  

    public static void main(String[] args) throws IOException{ 
        System.out.println("Please input the filename of your building floor plan");
        Scanner reader  = new Scanner(System.in);
        String filename = reader.nextLine();
        reader.close();
        BuildingFileParser fileParser = new BuildingFileParser(filename);
        buildGraph(fileParser.getPassages());
        System.out.println("You awake in the " + fileParser.getStartArea().toString() + " and desperately try to find a way out!");
        System.out.println("Haunted Areas");
        for(Area area: fileParser.getHauntedAreas()){
            System.out.println("\t"+ area);
        }
    }
}
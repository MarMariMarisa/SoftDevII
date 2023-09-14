package unit08.haunted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class BuildingFileParser {
    private Random RNG = new Random();
    private Collection<Area> exitAreas = new ArrayList<>();;
    private Collection<Area> safeAreas = new ArrayList<>();;
    private Collection<Area> hauntedArea = new ArrayList<>();;
    private Map<Area,Collection<Area>> passages = new HashMap<>();
    
    public BuildingFileParser(String filename) throws IOException{
        Collection<Area> connectedAreas = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename));) {
            String line;
            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] rooms = line.split(",");
                String[] individual = rooms[0].split("-");
                Area new_room = new Area(individual[0],AreaType.valueOf(individual[1]));
                new_room.Haunt(EvilPresenceUtil.getRandomPresence());
                connectedAreas.clear();
                for(int i = 1;i < rooms.length;i++){ 
                    
                    String[] connected = rooms[i].split("-");
                    Area connected_room = new Area(connected[0],AreaType.valueOf(connected[1]));
                    connected_room.Haunt(EvilPresenceUtil.getRandomPresence());
                    if(passages.containsKey(connected_room) == false){
                        passages.put(new_room,null);
                    }
                    connectedAreas.add(connected_room);
                    if(passages.containsKey(new_room) == true && passages.get(new_room) == null  ){
                        passages.remove(new_room);
                        passages.put(new_room,connectedAreas);
    
                    }else{
                        passages.put(new_room,connectedAreas);
                    }
                }
                
                
                if(new_room.getType() == AreaType.EXIT){
                    exitAreas.add(new_room);
                }else{
                    if(new_room.isHaunted() == true){
                        hauntedArea.add(new_room);
                    }else{
                        safeAreas.add(new_room);
                    }
                }
            }
        }
    }
    public Collection<Area> getSafeAreas(){
        return safeAreas;
    }
    public Collection<Area> getExitAreas(){
        return exitAreas;
    }
    public Collection<Area> getHauntedAreas(){
        return hauntedArea;
    }
    public Map<Area,Collection<Area>> getPassages(){
        return passages;
    }
    public Area getStartArea(){
       Area[] safeCopy = new Area[safeAreas.size()];
       safeAreas.toArray(safeCopy);
        return safeCopy[RNG.nextInt(safeCopy.length-1)];
    }


    public static void main(String[] args) throws IOException{
        BuildingFileParser parser = new BuildingFileParser("data/haunted/apartment.csv");
        System.out.println(parser.passages);
    }
}

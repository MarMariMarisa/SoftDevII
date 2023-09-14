package unit08.haunted;


import java.io.IOException;

import unit08.backtracker.Backtracker;
import unit08.backtracker.Configuration;

public class EscapeBT implements Configuration{
    BuildingFileParser parser;
    public EscapeBT(String filename) throws IOException{
        this.parser = new BuildingFileParser(filename);
    }
    @Override
    public Collection<Area> getSuccessors(){

    }
    @Override
    public boolean isValid(){
        int length = parser.getPassages().size();
        Area lastQueen = queens[length - 1];
        for(int i = 0;i<= length-2;i++){
            if(lastQueen.canAttack(queens[i])){
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean isGoal(){

    }
}

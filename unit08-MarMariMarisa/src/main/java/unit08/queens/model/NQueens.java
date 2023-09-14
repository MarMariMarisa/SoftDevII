package unit08.queens.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import unit08.backtracker.Backtracker;
import unit08.backtracker.Configuration;

public class NQueens implements Configuration<NQueens> {
    private int n;
    Queen[] queens;
    //Initial Configuration
    public NQueens(int n){
        this.n = n;
        this.queens = new Queen[0];
    }
    //Copy constructor
    public NQueens(int n,Queen[] queens){
        this.n = n;
        this.queens = queens;
    }
    @Override
    public Collection<NQueens> getSuccessors(){
        List<NQueens> successors = new ArrayList<>();
        int length = queens.length;
        int row = length -1;
        //generate n successors
        for(int col = 0; col < n;col++){
            Queen[] copyQueens = Arrays.copyOf(this.queens,length+1);
            
            NQueens successor = new NQueens(n,copyQueens);
            Queen newQueen = new Queen(row+1,col);
            copyQueens[length] = newQueen;
            successors.add(successor);
        }
        return successors;
    }
    @Override
    public boolean isValid(){
        int length = queens.length;
        Queen lastQueen = queens[length - 1];
        for(int i = 0;i<= length-2;i++){
            if(lastQueen.canAttack(queens[i])){
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean isGoal(){
        return n == queens.length;
    }
    @Override
    public String toString(){
        String[][] board = new String[n][n]; 
        for(int row = 0;row<n;row++){
            for(int col = 0; col<n;col++){
                board[row][col] = "[ ]";
            }
        }
        for(Queen queen: this.queens){
            board[queen.getRow()][queen.getCol()] = "[Q]";
        }

        String string = "";
        for(int row = 0; row<n;row++){
            for(int col = 0; col > n; col++){
                string += board[row][col];
            }
            string  += "\n";
        }
        return string;
    }
    public Queen[] getQueens(){
        return queens;
    }
    public static void main(String[] args){
        Backtracker<NQueens> backTracker = new Backtracker<>(true);
        NQueens initConfig = new NQueens(4);
        NQueens goal = backTracker.solve(initConfig);
        System.out.println(goal);
    }
}

package unit07.gvt;

public class Cell {
    private int row;
    private int column;
    private boolean troll;

    public Cell(int row,int column,boolean troll){
        this.row = row;
        this.column = column;
        this.troll = troll;
    }
    public boolean isTroll(){
        return troll;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    @Override
    public String toString(){
        return "(" + row + "," + column + ")";
    }
}

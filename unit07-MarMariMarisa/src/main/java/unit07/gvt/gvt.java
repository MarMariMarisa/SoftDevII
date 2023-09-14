package unit07.gvt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class gvt {
    private AdjacencyGraph<Cell> graph = new AdjacencyGraph<>();
    private int rows, cols;
    private Cell[][] grid;
    private LinkedList<Cell> trollCells = new LinkedList<>();

    public gvt(String filename) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader( new FileReader(filename))) {
            String[] rowsAndCols = reader.readLine().split(" ");
            rows = Integer.parseInt(rowsAndCols[0]);
            cols = Integer.parseInt(rowsAndCols[1]);
            grid = new Cell[rows][cols];
            for (int r = 0; r < rows; r++) {
                String[] cells = reader.readLine().split(" ");
                for (int c = 0; c < cols; c++) {
                    Boolean troll = cells[c].equals("T");
                    Cell cell = new Cell(r, c, troll);
                    grid[r][c] = cell;
                    graph.add(cell);
                    if (r > 0) {
                        graph.connectUndirected(grid[r-1][c], grid[r][c]);
                    }
                    if (c > 0) {
                        graph.connectUndirected(grid[r][c-1], grid[r][c]);
                    }
                    if (troll) {
                        trollCells.add(cell);
                    }
                }
            }

        }
    }

    public List<Cell> dfPathMage(){
        Set<Vertex<Cell>> settt = new HashSet<>();
        for(Cell cell : trollCells) {
            settt.add(graph.getVertex(cell));
        }
        System.out.println(trollCells);
        settt.add(graph.getVertex(grid[0][0]));
        return graph.visitDFPath(graph.getVertex(grid[0][0]), graph.getVertex(grid[rows - 1][cols - 1]), new HashSet<>());
    }

    @SuppressWarnings("unchecked")
    public List<Cell> dfPathFigher(){
        for (Cell troll : trollCells) {
            LinkedList<Cell> updatedTrolls = new LinkedList<>();
            updatedTrolls = (LinkedList<Cell>) trollCells.clone();
            updatedTrolls.remove(troll);
            Set<Vertex<Cell>> trollSet = new HashSet<>();
            for (Cell cell : updatedTrolls) {
                trollSet.add(graph.getVertex(cell));
            }
            trollSet.add(graph.getVertex(grid[0][0]));
            List<Cell> possiblePath = graph.visitDFPath(graph.getVertex(grid[0][0]), graph.getVertex(grid[rows-1][cols-1]), trollSet);
            if (possiblePath != null) {
                return possiblePath;
            }
        }
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        gvt mage = new gvt("unit07-marmarimarisa/data/dfs/graph1_mage.txt");
        System.out.println(mage.dfPathFigher());

        gvt fighter = new gvt("unit07-marmarimarisa/data/dfs/graph1_fighter.txt");
        System.out.println(fighter.dfPathFigher());
    }
}
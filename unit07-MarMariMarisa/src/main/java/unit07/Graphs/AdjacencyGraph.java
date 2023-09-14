package unit07.Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdjacencyGraph<E> implements Graph<E> {
    private Map<E, Vertex<E>> vertices;

    public AdjacencyGraph(){
        this.vertices = new HashMap<>();
    }

    @Override
    public void add(E value) {
        Vertex<E> vertex = new Vertex<>(value);
        this.vertices.put(value, vertex);
    }

    @Override
    public boolean contains(E value) {
        return this.vertices.containsKey(value);
    }

    @Override
    public int size() {
        return this.vertices.size();
    }

    @Override
    public void connectDirected(E a, E b) {
        Vertex<E> aVertex = this.vertices.get(a);
        Vertex<E> bVertex = this.vertices.get(b);
        aVertex.connect(bVertex);
    }

    @Override
    public void connectUndirected(E a, E b) {
        Vertex<E> aVertex = this.vertices.get(a);
        Vertex<E> bVertex = this.vertices.get(b);
        aVertex.connect(bVertex);
        bVertex.connect(aVertex);
    }

    @Override
    public boolean connected(E a, E b) {
        Vertex<E> aVertex = this.vertices.get(a);
        Vertex<E> bVertex = this.vertices.get(b);
        return aVertex.connected(bVertex);
    }
    @Override
    public boolean bfSearch(E start, E end){
        Vertex<E> startV = this.vertices.get(start);
        Vertex<E> endV = this.vertices.get(end);
        LinkedList<Vertex<E>> queue = new LinkedList<>();
        Set<Vertex<E>> visited = new HashSet<>();

        queue.add(startV);
        visited.add(startV);

        while(queue.size() > 0){
            Vertex<E> V = queue.remove(0);
            if(V == endV){
                return true;
            }
            for(Vertex<E> n : V.getNeighbors()){
                if(visited.contains(n) == false){
                    queue.add(n);
                    visited.add(n);
                }
            }
        }
        return false;
    }
    @Override
    public List<E> bfPath(E start, E end){
        Vertex<E> startV = this.vertices.get(start);
        Vertex<E> endV = this.vertices.get(end);

        LinkedList<Vertex<E>> queue = new LinkedList<>();
        Map<Vertex<E>, Vertex<E>> visited = new HashMap<>();

        queue.add(startV);
        visited.put(startV, null);

        while(queue.size() > 0){
            Vertex<E> v = queue.remove(0);
            for(Vertex<E> n : v.getNeighbors()){
                if(!visited.containsKey(n)){
                    visited.put(n, v);
                    queue.add(n);
                }
            }
        }

        return makePath(visited, endV);
    }

    protected List<E> makePath(Map<Vertex<E>, Vertex<E>> predecessors, Vertex<E> end){
        if(predecessors.containsKey(end)){
            LinkedList<E> path = new LinkedList<>();
            Vertex<E> current = end;
            while (current != null){
                path.add(0, current.getValue());
                Vertex<E> predecessor = predecessors.get(current);
                current = predecessor;
            }
            return path;
        } else {
            return null;
        }
    }

    protected Map<E, Vertex<E>> getVertices(){
        return vertices;
    }
}
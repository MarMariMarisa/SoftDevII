package unit08.graphs;

import java.util.LinkedList;
import java.util.List;

import unit08.ds.Queue;

public class TupleQueue<E> implements Queue<PathTuple<E>> {
    private final List<PathTuple<E>> queue;

    public TupleQueue() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(PathTuple<E> element) {
        queue.add(element);
    }

    @Override
    public PathTuple<E> dequeue() {
        int index = 0;
        PathTuple<E> closest = queue.get(index);

        for (int i = 0; i < queue.size(); i++) {
            PathTuple<E> candidate = queue.get(i);
            if (candidate.getDistance() < closest.getDistance()) {
                closest = candidate;
                index = i;
            }
        }

        queue.remove(index);

        return closest;
    }

    @Override
    public int size() {
        return queue.size();
    }

}
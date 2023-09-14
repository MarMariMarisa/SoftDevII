package unit05.mcf;

public interface List<E> {
    void append(E value);

    E get(int index);

    void set(int index, E value);

    int size();

    @Override
    default Iterator<E> iterator(){
        throw new UnsupportedOperationException("Iterator is not supported");
    }

}

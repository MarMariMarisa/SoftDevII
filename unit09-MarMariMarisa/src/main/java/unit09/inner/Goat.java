package unit09.inner;

public class Goat {
    private String name;

    public Goat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
package unit02.Homework.chickens;

public enum Colors {
    BROWN(),
    WHITE();
    @Override
    public String toString(){
        return name();
    }
}

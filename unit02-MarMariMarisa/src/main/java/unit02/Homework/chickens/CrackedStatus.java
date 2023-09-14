package unit02.Homework.chickens;

public enum CrackedStatus {
    CRACKED(),
    UNCRACKED();
    @Override
    public String toString(){
        return name();
    }
}

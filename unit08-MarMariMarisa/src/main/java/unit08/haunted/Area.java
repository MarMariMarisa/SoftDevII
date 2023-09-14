package unit08.haunted;

public class Area {
    private String name;
    private AreaType type;
    private String evilPresence;

    public Area(String name,AreaType type){
        this.name = name;
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public AreaType getType(){
        return type;
    }
    public boolean isHaunted(){
        return evilPresence != null;
    }
    public void Haunt(String evilPresence){
        this.evilPresence = evilPresence;
    }
    @Override
    public String toString(){
        return name + "[" + type + "/" + evilPresence + "]";
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Area){
            Area otherArea = (Area)other;
            return this.hashCode() == otherArea.hashCode();
        }
        return false;
    }
    @Override
    public int hashCode(){
        int hashCode = 0;
        char[] chars = name.toCharArray();
        for(int i = 0; i < chars.length; i++){
            hashCode = hashCode + (int)chars[i] + i;
        }
        return hashCode;
    }


}

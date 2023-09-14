package unit02.Homework.chickens;
import java.util.Random;

public class Chicken {
    public Names[] names = Names.values();
    public Sizes[] sizes = Sizes.values();
    public Colors[] colors = Colors.values();

    private Names firstname;
    private Names lastname;
    private Colors color;
    private Sizes size;

    public Chicken(){
        Random rand = new Random();
        this.size = sizes[rand.nextInt(sizes.length)];
        this.color = colors[rand.nextInt(colors.length)];
        this.firstname = names[rand.nextInt(sizes.length)];
        this.lastname = names[rand.nextInt(colors.length)];
    }
    public Egg layEgg(){
        return new Egg(this.color,this.size);
    }
    //These accessors were written to aid in testing of class
    public Sizes getSize(){
        return size;
    }
    public Colors getColors(){
        return color;
    }
    @Override
    public String toString(){
        return firstname.toString() + " "  + lastname.toString() + ", a chicken that lays " + size.toString() + " " + color.toString() + " eggs";
    }

}

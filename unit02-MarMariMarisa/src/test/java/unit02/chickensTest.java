package unit02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import unit02.Homework.chickens.*;
public class chickensTest {
    @Test
    public void testLayEggAndEquality(){
        //setup
        Chicken chicken = new Chicken();
        Sizes size = chicken.getSize();
        Colors color = chicken.getColors();
;       Egg expected = new Egg(color,size);
        //invoke
        Egg actual = chicken.layEgg();
        //analyze
        assertEquals(expected, actual);
    }
    @Test
    public void testCrackEgg(){
        //setup
        Chicken chicken = new Chicken();
        Egg egg = chicken.layEgg();
        //invoke
        egg.crackEgg();
        CrackedStatus expected = CrackedStatus.CRACKED;
        CrackedStatus actual = egg.getStatus();
        //analyze
        assertEquals(expected, actual);
    }


}

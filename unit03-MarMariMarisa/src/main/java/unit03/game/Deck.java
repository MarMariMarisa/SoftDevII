package unit03.game;
import java.util.Random;
public class Deck {
    private int topCard;
    private int[] theDeck = new int[98];
    private int topCount = 0;
    public Deck(){
        for(int i = 2;i<= 98;i++){
            theDeck[i - 2] = i;
        }
        this.topCard = theDeck[topCount];
    }
    public void shuffleDeck(){
        Random rand = new Random();
        //replace cards that have been drawn
        for(int i = 2;i<= 98;i++){
            theDeck[i - 2] = i;
        }
        //shuffle deck
        for(int i = 0; i < theDeck.length;i++){
            int holder = theDeck[i];
            int pick = rand.nextInt(theDeck.length - 1);
            theDeck[i] = theDeck[pick];
            theDeck[pick] = holder;
        }
        this.topCount = 0;
    }
    public int drawCard(){
            if(topCount == theDeck.length - 1){
                throw new ArrayIndexOutOfBoundsException();
            }
            topCount ++;
            int theCard = topCard;
            topCard = theDeck[topCount];
            return theCard;
    }

    public int remainingCardCount(){
        return theDeck.length - topCount;
    }
    @Override
    public String toString(){
        int remaining = remainingCardCount();
        if(remaining <= 9){
            return "[0" + remainingCardCount() + "]";
        }
        return "[" + remainingCardCount() + "]";
    }

}

package unit03.game;

public class DescendingPile extends DiscardPile {
    private static final String RULES = "Card must be discarded in descending order unless the card is exactly 10 more than the top card";
    public DescendingPile(int topCard){
        super(100);
    }
    @Override
    public boolean discard(int card){
        if(card < getTopCard() || card - 10 == getTopCard()){
            setTopCard(card);
            return true;
        }
        return false;
    }

    @Override
    public String getRules(){
        return RULES;
    }
    @Override
    public String toString(){
        if(getTopCard() <= 9){
            return "-{0" + getTopCard() + "}";
        }
        return "-{" + getTopCard() + "}";
    }

   
}

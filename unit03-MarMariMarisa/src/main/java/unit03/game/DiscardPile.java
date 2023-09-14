package unit03.game;

public abstract class DiscardPile {
    private int topCard;
    private int cardCount;

    public DiscardPile(int topCard){
        this.topCard = topCard;
        this.cardCount = 0;
    }

    public int getTopCard(){
        return topCard;
    }

    public int getCardCount(){
        return cardCount;
    }
    public void setTopCard(int card){
        topCard = card;
        cardCount++;
    }
    public abstract boolean discard(int card);
    public abstract String getRules();
    public abstract String toString();


}

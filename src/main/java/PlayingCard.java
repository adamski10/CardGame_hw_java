public class PlayingCard {

    private SuitType suit;
    private RankType rank;

    public PlayingCard(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public SuitType getSuit() {
        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public int getValueFromRankEnum() {
        return this.rank.getValue();
    }

    public String toString(){
        return rank + " of " + suit ;
    }


}

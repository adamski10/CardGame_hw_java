import java.util.ArrayList;

public class Player {

    private ArrayList<PlayingCard> cards;
    private String name;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<PlayingCard>();
    }

    public String getName() {
        return this.name;
    }

    public void getCard(Deck deck, Dealer dealer) {
      PlayingCard newCard = dealer.dealCard(deck);
      this.cards.add(newCard);
    }

    public int countCards() {
        return this.cards.size();
    }

    public int showCards() {
        int total = 0;
        for(PlayingCard card : cards){
            int value = card.getValueFromRankEnum();
            total += value;

        }return total;
    }
}

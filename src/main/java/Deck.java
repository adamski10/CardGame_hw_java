import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Deck {

    private ArrayList<PlayingCard> deck;

    public Deck() {
        this.deck = new ArrayList<PlayingCard>();

    }

    public int getDeckSize() {
      return this.deck.size();
    }

    public void populateDeck(){
        this.deck.clear();

        for(RankType rank : RankType.values()) {
            for (SuitType suit : SuitType.values()) {
                this.deck.add(new PlayingCard(suit, rank));

            }


        }
    }

    public PlayingCard getFirstCard() {
        return this.deck.get(0);
    }

    public void shuffleCards() {
        this.populateDeck();
        Collections.shuffle(this.deck);
    }


    public PlayingCard giveCard() {
        return  this.deck.remove(0);
    }




}


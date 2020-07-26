import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canGetDeckSize() {
        assertEquals(0, deck.getDeckSize());
    }

    @Test
    public void deckHasCards(){
      deck.populateDeck();
      assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void deckCanShuffleCards() {
        deck.populateDeck();
        PlayingCard card1 = deck.getFirstCard();
        deck.shuffleCards();
        PlayingCard card2 = deck.getFirstCard();
        assertNotEquals(card2, card1);
    }

    @Test
    public void canGiveCard(){
      deck.shuffleCards();
      deck.giveCard();
      assertEquals(51, deck.getDeckSize());
    }


}

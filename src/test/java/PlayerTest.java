import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Deck deck;
    private Dealer dealer;

    @Before
    public void before() {
        player1 = new Player("Bob");
        deck = new Deck();
        dealer = new Dealer("Jack");
    }

    @Test
    public void canGetPlayerName() {
        assertEquals("Bob", player1.getName());
    }
    @Test
    public void canGetCard(){
        deck.populateDeck();
       player1.getCard(deck, dealer);
       assertEquals(1, player1.countCards());
    }
    @Test
    public void canShowCards(){
        deck.populateDeck();
        player1.getCard(deck, dealer);
        player1.getCard(deck, dealer);
        assertEquals(2, player1.showCards());
    }




}

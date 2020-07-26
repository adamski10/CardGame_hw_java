import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    private Dealer dealer;
    private Deck deck;
    private Player player;


    @Before
    public void before() {
        dealer = new Dealer("John");
        deck = new Deck();
        player = new Player("Chris");
    }

    @Test
    public void hasName(){
        assertEquals("John", dealer.getName());
    }

    @Test
    public void canShowCards(){
        deck.populateDeck();
        dealer.getCard(deck);
        dealer.getCard(deck);
        assertEquals(2, dealer.showCards());
    }

    @Test
    public void canGetCards(){
        deck.populateDeck();
        dealer.getCard(deck);
        assertEquals(1, dealer.countCards());
    }

    @Test
    public void canStartGame(){
        dealer.startGame(deck, player, dealer);
        assertEquals(2, dealer.countCards());
        assertEquals(2, player.countCards());
    }



    @Test
    public void canShowTheWinner(){
        dealer.startGame(deck, player, dealer);
        dealer.showTheWinner(dealer, player);
        assertEquals(3, dealer.countCards());
    }

}

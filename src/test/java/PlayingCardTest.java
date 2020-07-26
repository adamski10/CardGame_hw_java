import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayingCardTest {

    private PlayingCard card1;

    @Before
    public void before(){
        card1 = new PlayingCard(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.HEARTS, card1.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.ACE, card1.getRank());
    }

    @Test
    public void hasValue(){
        assertEquals(11, card1.getValueFromRankEnum());
    }

    @Test
    public void hasName(){
        assertEquals("ACE of HEARTS", card1.toString());
    }
}

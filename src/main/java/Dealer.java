import java.util.ArrayList;

public class Dealer {
    private String name;
    private ArrayList<PlayingCard> dealerCards;

    public Dealer(String name){
        this.name = name;
        this.dealerCards = new ArrayList<PlayingCard>();
;    }

    public String getName() {
        return this.name;
    }

    public int showCards() {
        int total = 0;
        for(PlayingCard card : dealerCards){
            int value = card.getValueFromRankEnum();
            total += value;

        }return total;
    }

    public void showSuit(){


        for (PlayingCard card : dealerCards){
            System.out.println(card.getSuit());
        }

    }

    public void getCard(Deck deck) {
         PlayingCard newCard = deck.giveCard();
         this.dealerCards.add(newCard);
    }

    public PlayingCard dealCard(Deck deck){
        return deck.giveCard();
    }

    public int countCards() {
        return this.dealerCards.size();
    }


    public void startGame(Deck deck, Player player, Dealer dealer){
        deck.shuffleCards();
        dealer.getCard(deck);
        dealer.getCard(deck);
        player.getCard(deck, dealer);
        player.getCard(deck, dealer);
        if(dealer.showCards() < 16) {
            dealer.getCard(deck);
        }

    }

    public void showTheWinner(Dealer dealer, Player player){
        int value1 = dealer.showCards();
        int value2 = player.showCards();
        if(value1  > value2 && value1 <= 21 || value2 > 21){
            System.out.println("The winner is " + dealer.getName() + " with " + value1 + " points.");
            System.out.println(player.getName() + " had " + value2 + " points.");
        }else if (value2  > value1 && value2 <= 21 || value1 > 21) {
            System.out.println("The winner is " + player.getName() + " with " + value2 + " points.");
            System.out.println(dealer.getName() + " had " + value2 + " points.");
        }else if (value1 == value2) {
            System.out.println("Draw");
        }
    }
}

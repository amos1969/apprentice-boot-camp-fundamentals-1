package cards;

import java.util.ArrayList;

public class PlayingCardDeck extends Deck {

    PlayingCardDeck() {
        this.cards = new ArrayList<>();
        Suit[] suits = {new Suit("clubs"), new Suit("diamonds"), new Suit("hearts"), new Suit("spades")};
        for (int i = 0; i < 52; i++) {
            this.cards.add(new PlayingCard((i % 13), suits[i/13]));
        }
    }

    @Override
    public String toString() {
        return this.cards.toString();
    }
}

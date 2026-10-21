package cards;

import java.util.Arrays;

public class PlayingCardDeck {
    PlayingCard[] cards;

    PlayingCardDeck() {
        this.cards = new PlayingCard[52];
        Suit[] suits = {new Suit("clubs"), new Suit("diamonds"), new Suit("hearts"), new Suit("spades")};
        for (int i = 0; i < this.cards.length; i++) {
            this.cards[i] = new PlayingCard((i % 13), suits[i/13]);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.cards);
    }

}

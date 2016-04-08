package ch.bbv.dojo;

import static java.lang.String.format;

/**
 * Created by gro on 31/01/16.
 */
public class Card implements Comparable<Card> {

    private final Suite suite;
    private final CardValue value;

    public Card(Suite suite, CardValue cardValue) {
        this.suite = suite;
        this.value = cardValue;
    }

    public CardValue getValue() {
        return value;
    }

    public static Card card(String card) {
        return new Card(Suite.of(card.substring(0,1)), CardValue.of(Integer.parseInt(card.substring(1))));
    }

    @Override
    public String toString() {
        return format("%s%s", suite.toString().charAt(0), value.getIntVal());
    }

    @Override
    public int compareTo(Card o) {
        if (this.suite != o.suite) {
            return this.suite.compareTo(o.suite);
        } else {
            return this.value.compareTo(o.value);
        }
    }
}

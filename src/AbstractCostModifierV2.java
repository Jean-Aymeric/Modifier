public abstract class AbstractCostModifierV2 {
    private final Card card;

    protected AbstractCostModifierV2(final Card card) {
        this.card = card;
    }

    public Card getCard() {
        return this.card;
    }

    public abstract int getValue();
}

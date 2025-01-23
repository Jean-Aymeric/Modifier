public class CostModifierBonusV2 extends AbstractCostModifierV2 {
    private final int value;

    public CostModifierBonusV2(final Card card, final int value) {
        super(card);
        this.value = value;
    }

    @Override
    public int getValue() {
        System.out.println(this.value + "*" + this.getCard().getBonus());
        return this.value * this.getCard().getBonus();
    }
}

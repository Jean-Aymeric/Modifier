public class CostModifierBonus extends AbstractCostModifier {
    private final int value;

    public CostModifierBonus(final int value) {
        this.value = value;
    }

    @Override
    public int getValue(final Card card) {
        System.out.println(this.value + "*" + card.getBonus());
        return this.value * card.getBonus();
    }
}

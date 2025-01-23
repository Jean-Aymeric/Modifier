public class CostModifierValue extends AbstractCostModifier {
    private final int value;

    public CostModifierValue(final int value) {
        this.value = value;
    }

    @Override
    public int getValue(final Card card) {
        System.out.println(this.value);
        return this.value;
    }
}

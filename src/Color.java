import java.util.ArrayList;
import java.util.List;

public enum Color {
    RED,
    BLUE,
    GREEN,
    PURPLE;

    static {
        Color.RED.addCostModifier(new CostModifierValue(1));
        Color.BLUE.addCostModifier(new CostModifierValue(2));
        Color.GREEN.addCostModifier(new CostModifierValue(3));
        Color.PURPLE.addCostModifier(new CostModifierBonus(4));
    }

    private final List<AbstractCostModifier> costModifiers = new ArrayList<>();

    private void addCostModifier(AbstractCostModifier costModifier) {
        this.costModifiers.add(costModifier);
    }

    public int getCostModifier(final Card card) {
        int result = 0;
        for (AbstractCostModifier costModifier : this.costModifiers) {
            result += costModifier.getValue(card);
        }
        return result;
    }
}

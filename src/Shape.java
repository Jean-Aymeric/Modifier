import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    private final List<AbstractCostModifierV2> costModifiers = new ArrayList<>();

    public Shape(Card card) {

    }

    protected void addCostModifier(AbstractCostModifierV2 costModifier) {
        this.costModifiers.add(costModifier);
    }

    public int getCostModifier() {
        int result = 0;
        for (AbstractCostModifierV2 costModifier : this.costModifiers) {
            result += costModifier.getValue();
        }
        return result;
    }

}

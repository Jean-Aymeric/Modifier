public class Circle extends Shape {
    public Circle(final Card card) {
        super(card);
        this.addCostModifier(new CostModifierValueV2(card, 1));
    }
}

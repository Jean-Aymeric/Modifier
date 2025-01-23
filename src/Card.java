public class Card {
    int cost;
    Color color;
    int bonus;
    Shape shape;

    public Card(final int cost, final Color color, final int bonus) {
        this.cost = cost;
        this.color = color;
        this.bonus = bonus;
    }

    public void setShape(final Shape shape) {
        this.shape = shape;
    }

    public int getBonus() {
        return this.bonus;
    }

    public int getCost() {
        System.out.println(this.cost);
        return this.cost + this.color.getCostModifier(this) + this.shape.getCostModifier();
    }
}

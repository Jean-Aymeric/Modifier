public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(1, Color.PURPLE, 3);
        card1.setShape(new Circle(card1));
        System.out.println(card1.getCost());
    }
}
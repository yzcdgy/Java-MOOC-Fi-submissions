
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Suitcase suit = new Suitcase(20);
        Item item1 = new Item("Sex1", 8);
        Item item2 = new Item("Sex2", 8);
        Item item3 = new Item("Sex3", 8);
        suit.addItem(item1);
        suit.addItem(item2);
        suit.addItem(item3);
        System.out.println(suit);
    }

}

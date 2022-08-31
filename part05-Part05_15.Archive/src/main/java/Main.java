
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        String id;
        String name;

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();

            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (emptry will stop)");
            name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            
            Item item = new Item(name, id);

            if (!items.contains(item)) {
                items.add(item);
            }
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}

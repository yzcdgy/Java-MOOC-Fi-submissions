
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int container1 = 0;
        int container2 = 0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] command = input.split(" ");
            if (command[0].equals("add")) {
                if (Integer.valueOf(command[1]) < 0) {
                    continue;
                }
                container1 += Integer.valueOf(command[1]);
                if (container1 >= 100) {
                    container1 = 100;
                }
            }

            if (command[0].equals("move")) {
                if (Integer.valueOf(command[1]) > container1) {
                    container2 = container1;
                    container1 = 0;
                    continue;
                }
                container1 -= Integer.valueOf(command[1]);
                container2 += Integer.valueOf(command[1]);
                if (container2 >= 100){
                    container2 = 100;
                }
            }

            if (command[0].equals("remove")) {
                container2 -= Integer.valueOf(command[1]);
                if(container2 < 0){
                    container2 = 0;
                }
            }
        }
    }
}

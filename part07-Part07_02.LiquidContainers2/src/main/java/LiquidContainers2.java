
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            if (input.equals("quit")) {
                break;
            }
            if (parts[0].equals("add")){
                container1.add(Integer.valueOf(parts[1]));
            }
            
            if (parts[0].equals("remove")){
                container2.remove(Integer.valueOf(parts[1]));
            }
            
            if (parts[0].equals("move")){
                if(container1.contains() < Integer.valueOf(parts[1])){
                    container2.remove(container2.contains());
                    container2.add(container1.contains());
                    container1.remove(container1.contains()); 
                    continue;
                }              
                container1.remove(Integer.valueOf(parts[1]));
                container2.add(Integer.valueOf(parts[1]));
            }       
           
        }
    }

}

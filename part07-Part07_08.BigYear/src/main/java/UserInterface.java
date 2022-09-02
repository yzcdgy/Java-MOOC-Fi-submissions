
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yz
 */
public class UserInterface {

    private Scanner scan;
    private Database database;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.database = new Database();
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = this.scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("Add")) {
            String name;
            String latinName;

            System.out.println("Name:");
            name = this.scan.nextLine();
            System.out.println("Name in Latin");
            latinName = this.scan.nextLine();

            Bird tempBird = new Bird(name, latinName);
            this.database.addBird(tempBird);
        }

        if (command.equals("Observation")) {
            String name;
            System.out.println("Bird?");
            name = this.scan.nextLine();

            for (Bird bird : this.database.getBirds()) {
                if (bird.getName().equals(name)) {
                    bird.addObs();
                    break;
                }
            }
            System.out.println("Not a bird!");
        }

        if (command.equals("All")) {
            System.out.println(this.database);
        }

        if (command.equals("One")) {
            if (!this.database.getBirds().isEmpty()) {
                String birdQuery = this.scan.nextLine();
                for(Bird bird : this.database.getBirds()){
                    if(bird.getName().equals(birdQuery)){
                        System.out.println(bird);
                    }
                }
            }
        }
    }
}

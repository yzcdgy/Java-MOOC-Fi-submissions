
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

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        String command = "";
        while (true) {
            command = this.scan.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }

    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        }
        if (command.equals("list")) {
            this.list();
        }
        if (command.equals("remove")) {
            this.remove();
        }
    }

    public void add() {
        String command = "";
        System.out.println("To add:");
        this.list.add(this.scan.nextLine());
    }

    public void list() {
        this.list.print();
    }

    public void remove() {
        int remove = 0;
        System.out.println("Which one is removed?");
        this.list.remove(Integer.valueOf(this.scan.nextLine()));
    }
}

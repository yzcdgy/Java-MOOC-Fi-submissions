
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
    private JokeManager manager;
    private Scanner scan;
    
    public UserInterface(JokeManager manager, Scanner scan){
        this.manager = manager;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            String command = this.scan.nextLine();
            if(command.equals("X")){
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command){
        if(Integer.valueOf(command) == 1){
            this.manager.addJoke(this.scan.nextLine());
        }
        
        if(Integer.valueOf(command) == 2){
            this.manager.drawJoke();
        }
        
        if(Integer.valueOf(command) == 3){
            this.manager.printJokes();
        }
    }
}

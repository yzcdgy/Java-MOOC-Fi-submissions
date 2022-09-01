
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
public class TextUI {
    private Scanner scan;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scan, SimpleDictionary dict){
        this.scan = scan;
        this.dict = dict;
    }
    
    public void start(){
        String command = "";
        
        while(true){
            System.out.println("Command:");
            command = this.scan.nextLine();
            
            if(command.equals("end")){
                break;
            }
            
            if(command.equals("add")){
                String word = "";
                String trans = "";
                
                System.out.println("Word:");
                word = this.scan.nextLine();
                System.out.println("Translation:");
                trans = this.scan.nextLine();
                
                this.dict.add(word, trans);
                continue;
            }
            
            if(command.equals("search")){
                String word = "";
                
                System.out.println("To be translated:");
                word = this.scan.nextLine();
                if(this.dict.translate(word) == null){
                    System.out.println("Word " + word + " was not found");
                    continue;
                }
                System.out.println(this.dict.translate(word));
                continue;
            }
            
            System.out.println("Unknown command");
        }        
        System.out.println("Bye bye!");
    }
    
}

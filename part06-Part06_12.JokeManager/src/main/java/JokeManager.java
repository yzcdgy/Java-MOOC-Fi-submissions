
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(this.jokes.size());
        System.out.println(this.jokes.get(index));
        return this.jokes.get(index);
    }
    
    public void printJokes(){
        String finalOut = "";
        for (String joke : this.jokes){
            finalOut += joke + "\n";
        }
        System.out.println(finalOut);
        System.out.println(this.jokes);
    }
    
    
}

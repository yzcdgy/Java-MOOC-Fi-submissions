
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yz
 */
public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<>();
    }
    
    public ArrayList<Bird> getBirds(){
        return this.birds;
    }
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void addObservation(String bird) {
        for (Bird birdy : this.birds) {
            if (birdy.getName().equals(bird)) {
                birdy.addObs();
            }
        }
    }
    
    public String toString(){
        String temp = "";
        for (Bird bird : this.birds){
            temp += bird.toString() + "\n";
        }
        return temp;    
    }
}

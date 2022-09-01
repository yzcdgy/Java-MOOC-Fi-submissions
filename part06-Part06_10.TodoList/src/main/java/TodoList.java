
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
public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        String finalOut = "";
        for (String task : this.tasks) {
            finalOut += (this.tasks.indexOf(task) + 1) + ": " + task + "\n";
        }
        System.out.println(finalOut);
    }
    
    public void remove(int number){
        this.tasks.remove(number - 1);
    }
}

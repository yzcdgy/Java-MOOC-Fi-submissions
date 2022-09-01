
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int max) {
        this.items = new ArrayList<>();
        this.maxWeight = max;
    }

    public void addItem(Item item) {
        if ((this.totalWeight() + item.getWeight()) <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public ArrayList<Item> getItems(){
        return this.items;
    }
    
    public int totalWeight() {
        if(this.items.isEmpty()){
            return 0;
        }
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()){
            return null;
        }
        Item heaviestSoFar = this.items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviestSoFar.getWeight()) {
                heaviestSoFar = item;
            }
        }
        return heaviestSoFar;
    }

    public void printItems() {
        String finalOut = "";
        for (Item item : this.items) {
            if (this.items.indexOf(item) != this.items.size() - 1) {
                finalOut += item.getName() + " (" + item.getWeight() + " kg)";
            }
            finalOut += item.getName() + " (" + item.getWeight() + " kg)\n";
        }
        System.out.println(finalOut);
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + "kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + "kg)";
    }
}

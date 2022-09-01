
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> cases;

    public Hold(int max) {
        this.maxWeight = max;
        this.cases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) <= this.maxWeight) {
            this.cases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        if (!this.cases.isEmpty()) {
            for (Suitcase suitcase : this.cases) {
                totalWeight += suitcase.totalWeight();
            }
        }
        return totalWeight;
    }

    public void printItems() {
        String finalOut = "";
        for (Suitcase suit: this.cases) {
            for (Item item : suit.getItems()){
                finalOut += item;
            }
        }
        System.out.println(finalOut);
    }

    public String toString() {
        return this.cases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class Item {

    public String name;
    public String id;

    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if(this == compared){
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item cItem = (Item) compared;
 
        if (this.id.equals(cItem.id)) {
            return true;
        }
        return false;

    }

}

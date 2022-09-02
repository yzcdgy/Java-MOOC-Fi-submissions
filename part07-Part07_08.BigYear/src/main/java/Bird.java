/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class Bird {
    private String name;
    private String trans;
    private int observations;
    
    public Bird(String name, String trans){
        this.name = name;
        this.trans = trans;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getTrans(){
        return this.trans;
    }
    
    public int getObs(){
        return this.observations;
    }
    
    public void addObs(){
        this.observations++;
    }
    
    public String toString(){
        return this.getName() + "(" + this.getTrans() + "): " + this.getObs() + " observations";
    }
    
}

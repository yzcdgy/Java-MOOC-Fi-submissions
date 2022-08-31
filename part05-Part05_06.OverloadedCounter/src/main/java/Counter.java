/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0){
            return;
        }
        this.value += increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0){
            return;
        }
        this.value -= decreaseBy;
    }

}

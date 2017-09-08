/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsproject;

/**
 *
 * @author aparsons
 */
public class Shark extends Fish implements ISwim,IMakeSound{

    public Shark(boolean isSaltWater, String name) {
        super(isSaltWater, name);
        isSaltWater = true;
    }

    @Override
    public void swim() {
        System.out.println( name + " Is Swimming");
    }

    @Override
    public void makeSound() {
        System.out.println( name + " Says GAAARRRRR");
    }
    
}

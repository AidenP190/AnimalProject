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
public class Dolphin extends Mammal implements ISwim,IMakeSound{

    public Dolphin(double bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void swim() {
        System.out.println( name + " Is Swimming");
    }

    @Override
    public void makeSound() {
        System.out.println( name + " Says SWEEEK");
    }
    
}

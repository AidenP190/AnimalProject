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
public class Eagle extends Bird implements IWalk,IFly,ISwim,IMakeSound{

    public Eagle(int Wingspan, String name) {
        super(Wingspan, name);
    }

    @Override
    public void walk() {
        System.out.println( name + "Is Walking");
    }

    @Override
    public void fly() {
        System.out.println( name + " Is Flying");
    }

    @Override
    public void swim() {
        System.out.println( name + " Is Swimming");
    }

    @Override
    public void makeSound() {
        System.out.println( name + " Says BAKA");
    }
    
}

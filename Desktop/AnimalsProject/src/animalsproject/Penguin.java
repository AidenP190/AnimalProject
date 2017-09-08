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
public class Penguin extends Bird implements ISwim,IWalk,IMakeSound{

    public Penguin(int Wingspan, String name) {
        super(Wingspan, name);
    }

    @Override
    public void swim() {
        System.out.println(name + " Is Swimming");
    }

    @Override
    public void walk() {
        System.out.println( name + " Is Walking");
    }

    @Override
    public void makeSound() {
        System.out.println( name + " Says HHHAAAHHHAAAA");
    }
    
}

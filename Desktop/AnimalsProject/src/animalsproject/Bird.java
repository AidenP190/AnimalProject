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
public class Bird extends Animals{
    
    private int wingSpan;

    public Bird(final int Wingspan, String name) {
        super(name);
        this.wingSpan = Wingspan;
    }

    public int getWingspan() {
        return wingSpan;
    }

    public void setWingspan(int Wingspan) {
        this.wingSpan = Wingspan;
    }
    
     @Override
    public String toString() {
        return  getName() + "'s Wing Span is " + getWingspan() + "ft." ;
    }
    }


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
public class Mammal extends Animals{
    
    private double bodyTemp;

    public Mammal(final double bodyTemp, String name) {
        super(name);
        this.bodyTemp = bodyTemp;
        
    }

    public double getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
 @Override
    public String toString() {
        return  getName() + "'s Body Temp is " + getBodyTemp() + " Degrees." ;
    }
}

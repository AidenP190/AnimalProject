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
public class Fish extends Animals{
    
    private boolean isSaltWater;

    public Fish(final boolean isSaltWater, String name) {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    public boolean isIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }
 @Override
    public String toString() {
        return  getName() + " Is A Salt Water Fish? " + isIsSaltWater();
    }
}

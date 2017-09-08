/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsproject;

import java.util.ArrayList;

/**
 *
 * @author aparsons
 */
public class AnimalsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Ostrich Caleb = new Ostrich(6, "Caleb");
        Penguin AG = new Penguin(3, "AG");
        Eagle Tyler = new Eagle(7, "Tyler");
        Dolphin Parker = new Dolphin(97.7,"Parker");
        Lion MrG = new Lion(101.5, "MrG");
        Bat Zach = new Bat(111.2, "Zach");
        Shark Aiden = new Shark(true, "Aiden");
        Bass John = new Bass(false,"John");
        FlyingFish Blake = new FlyingFish(true,"Blake");
        
        
         ArrayList<Animals> Animals = new ArrayList<>();
        
        Animals.add(Caleb);
        Animals.add(AG);
        Animals.add(Tyler);
        Animals.add(Parker);
        Animals.add(MrG);
        Animals.add(Zach);
        Animals.add(Aiden);
        Animals.add(John);
        Animals.add(Blake);
        
        ArrayList<Bird> Birds = new ArrayList<>();
        {
            Birds.add(Caleb);
            Birds.add(AG);
            Birds.add(Tyler);
        }
        
        ArrayList<Mammal> Mammals = new ArrayList<>();
        {
            Mammals.add(Parker);
            Mammals.add(MrG);
            Mammals.add(Zach);
        }
        
        ArrayList<Fish> Fishs = new ArrayList<>();
        {
            Fishs.add(Aiden);
            Fishs.add(John);
            Fishs.add(Blake);
        }
        
        ArrayList<IFly> Flyers = new ArrayList<>();
        {
            Flyers.add(Zach);
            Flyers.add(Tyler);
            Flyers.add(Blake);
        }
        
        ArrayList<IWalk> Walkers = new ArrayList<>();
        {
            Walkers.add(Caleb);
            Walkers.add(AG);
            Walkers.add(Tyler);
            Walkers.add(Zach);
            Walkers.add(MrG);
        }
        
        ArrayList<ISwim> Swimmers = new ArrayList<>();
        {
            Swimmers.add(Caleb);
            Swimmers.add(AG);
            Swimmers.add(Tyler);
            Swimmers.add(Parker);
            Swimmers.add(MrG);
            Swimmers.add(Zach);
            Swimmers.add(Aiden);
            Swimmers.add(John);
            Swimmers.add(Blake);
        }
         ArrayList<IMakeSound> SoundMakers = new ArrayList<>();
        {
            SoundMakers.add(Caleb);
            SoundMakers.add(AG);
            SoundMakers.add(Tyler);
            SoundMakers.add(Parker);
            SoundMakers.add(MrG);
            SoundMakers.add(Zach);
            SoundMakers.add(Aiden);
            SoundMakers.add(John);
            SoundMakers.add(Blake);
        }
        
            System.out.println("---------------Animal Names---------------");
            
          for(Animals animal : Animals)
        {
            System.out.println(animal.getName());
        } 
          
          System.out.println("---------------Birds Wing Span---------------");
          
            for(Bird bird : Birds)
        {
            System.out.println(bird);
        }
            
            System.out.println("---------------Mammals Body Temp---------------");
            
            for(Mammal mammal : Mammals)
        {
            System.out.println(mammal);
        }
            
            System.out.println("---------------Salt Water Fish?---------------");
            
            for(Fish fish : Fishs)
        {
            System.out.println(fish);
        }
            
            System.out.println("---------------Sounds Made---------------");
            
            for(IMakeSound makesound : SoundMakers)
        {
            makesound.makeSound();
        }
        
            System.out.println("---------------Animals That Swim---------------");
            
            for(ISwim swimmer : Swimmers)
        {
            swimmer.swim();
        }
         
            System.out.println("---------------Animals That Walk---------------");
            
            for(IWalk walker : Walkers)
        {
            walker.walk();
        }
            
            System.out.println("---------------Animals That Flys---------------");
            
           for(IFly flyer : Flyers)
        {
            flyer.fly();
        }
           
            
        
    }
}

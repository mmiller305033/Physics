/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravity_calculator;

import java.util.Scanner;


/**
 *
 * @author Mark
 */
public class Gravity_calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double initialpos;
        double t;
        double v;
        double vf;
        final double a = -9.8;
        double finalpos;
        double distance;
        double hitsground;
        double hitsground2;
        
        
        //The questions below collect the initial data needed to perform the calculations
        Scanner input = new Scanner(System.in);
        System.out.println("What was the initial height?(in meters)");
        initialpos = input.nextDouble();
        System.out.println("What was the initial velocity?(in meters per second)");
        v = input.nextDouble();
        System.out.println("How long was the object falling?(in seconds)");
        t = input.nextDouble();
        
        
        //This is the formula to find the final height of the object
        finalpos = (.5 * a * (t * t) + (-v * t) + initialpos);
        System.out.println(finalpos);
        distance = initialpos - finalpos;
        
        
        //If the total distance is more than the initial height, it shows the user that the object fell the initial height
        if (distance >= initialpos) {
            System.out.println("The object fell a total of " + (initialpos) + " meters.");
            hitsground = (v - (Math.sqrt((v) * (v) - (4 * (.5 * a) * initialpos)))) / (2 * (.5 * a));
            hitsground2 = (v + (Math.sqrt((v) * (v) - (4 * (.5 * a) * initialpos)))) / (2 * (.5 * a));
            
            
            //If the object hits the ground this code shows the user when it hit the ground and how fast it was going when it hit
            if (hitsground < 0) {
                System.out.println("The object hit the ground after " + (hitsground2) + " seconds.");
                vf = v + ((-a) * hitsground2);
                System.out.println("The velocity of the object when it hit the ground was " + vf + " meters per second.");
            } else {
                System.out.println("The object hit the ground after " + (hitsground) + " seconds.");
                vf = v + ((-a) * hitsground);
                System.out.println("The velocity of the object when it hit the ground was " + vf + " meters per second.");
            }
        }
        //If the object has an upwards velocity, 0 meters is recorded for a distance
        else if (finalpos > initialpos) {
            System.out.println("The object fell a total of " + (0) + " meters.");
            } 
        
        else {
            System.out.println("The object fell a total of " + (distance) + " meters.");
            vf = v + ((-a) * t);
            if (t == 1) {
            System.out.println("After " + t + " second the object's final velocity was " + vf + " meters per second");
            }
            else {
                System.out.println("After " + t + " seconds the object's final velocity was " + vf + " meters per second");
            }
             hitsground = (v - (Math.sqrt((v) * (v) - (4 * (.5 * a) * initialpos)))) / (2 * (.5 * a));
            hitsground2 = (v + (Math.sqrt((v) * (v) - (4 * (.5 * a) * initialpos)))) / (2 * (.5 * a));
            if (hitsground < 0) {
                System.out.println("The object hit the ground after " + (hitsground2) + " seconds.");
                vf = v + ((-a) * hitsground2);
                System.out.println("The velocity of the object when it hit the ground was " + vf + " meters per second.");
            } else {
                System.out.println("The object would have hit the ground after " + (hitsground) + " seconds.");
               
               
            }
        }

    }
}

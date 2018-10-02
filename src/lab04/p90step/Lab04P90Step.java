/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04.p90step;

/**
 *
 * @author DSFerreira
 */
public class Lab04P90Step {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int stairs = 5;
        
        int energy = 5;
        
        System.out.println("Single Steps: " +  "\t\t" + getSteps(stairs));
        System.out.println("Both Feet Same Steps: " +  "\t" + getBothFeetSteps(stairs));
        System.out.println("Double Steps: " +  "\t\t" + getDoubleSteps(stairs));
        System.out.println("Triple Steps: " +  "\t\t" + getTripleSteps(stairs));
        System.out.println("Up&Down Every Steps: " +  "\t" + getSuperSteps(stairs));
        System.out.println("Alt Super Steps: " + "\t" + getAltSuperSteps(stairs));
        //System.out.println()
    }
    
    public static int getSteps(int stairs) {
        return stairs * 2;
    }
    
    public static int getBothFeetSteps(int stairs) {
        return stairs * 4;
    }
    
    public static int getDoubleSteps(int stairs) {
        if ((stairs % 2) == 0) {
            return stairs;
        } else {
            return stairs + 1;
        }
    }
    
    public static int getTripleSteps(int stairs) { //after each multiple of 3 it increases by 2
        if (((stairs*2) % 3) == 0) {
            return (stairs*2)/3;
        }
        if (((stairs*2)+1) % 3 == 0 && ((stairs*2)+1) % 6 == 0) {
            return ((stairs*2)+1)/3;
        }
        if (((stairs*2)+2) % 3 == 0) {
            return ((stairs*2)+2)/3;
        }
        if (((stairs*2)+3) % 3 == 0) {
            return ((stairs*2)+3)/3;
        } else {
            return ((stairs*2)+4)/3;
        }
    }
    
    public static int getSuperSteps(int stairs) {
        return (stairs * stairs) + stairs;
    }
    
    public static int getAltSuperSteps(int stairs) { //3 = 10    4 = 16
        int totalSteps = 0;
        for (int x = 1; x <= stairs; x++) {
            if (x % 2 == 0) {
                totalSteps = totalSteps + getDoubleSteps(x);
            } else {
                totalSteps = totalSteps + getSteps(x);
            }
        }
        return totalSteps;
    }
}

/*
Aaron Newton
ajn54@pitt.edu
 */
package height;

import java.util.Scanner;

/**
 *
 * @author ajn54
 */
public class Height {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 9.8;
        Scanner var = new Scanner(System.in);
        System.out.println("Enter time in seconds");
        double t = var.nextDouble();
        double vi = 0;
        double vf;
        double d;
        
        vf = vi + (a*t);
        d = (vi*t) + ((a)*(Math.pow(t,2))/2);
        
        System.out.println("The height of the building is: " + d);
        
                
    }
    
}

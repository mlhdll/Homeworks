/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melih
 */
import java.util.*;
public class W7HomeworkX4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        double u = inp.nextInt();
        double b = u/(2+Math.sqrt(2));
        double a = u*b;
        
        System.out.println(a);
        System.out.println(b);
    }
    
}

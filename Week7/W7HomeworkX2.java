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
public class W7HomeworkX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        double ab = inp.nextInt();
        double cb = 2*ab/(1+Math.sqrt(5));
        
        System.out.println(ab);
        System.out.println(cb);
    }
    
}

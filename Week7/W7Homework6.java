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
public class W7Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        double c = 1;
        
        for (int k = 1; k <= n; k++) {
            double c1 = 4*k*k;
            c *= c1/(c1-1);
        }
        System.out.println(2*c);
    }
}

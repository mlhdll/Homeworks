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
public class W7Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();
        int n =inp.nextInt();
        int m = 0;
        for (int i = 1; i <= n; i++) 
        {
            double x = rnd.nextDouble();
            double y = rnd.nextDouble();
            
            if(x*x+y*y<1)
            {
                m += 1;
            }
        }
        System.out.println(4*((double)m/(double)n));
    }
    
}

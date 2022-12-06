/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melih
 */
import java.util.Scanner;
public class W3Homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int T=0;
        int S=0;
          while (S<=10) {
          
            T = T + (2*S);
            S = S + 2;
                
        }
        System.out.println(T);
        
        
    }
    
}

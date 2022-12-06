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
public class W3Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int F=1;
        int S=20;
        
        while (S>=1) {
            
            S= S-3;
            F= F+S;
            F= F+2;
        }
             System.out.println(F);   
        
        
    }
    
}

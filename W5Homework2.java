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
public class W5Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int S;
        
        System.out.println("3a+5b=[Girdiğiniz Sayı]");
        
        do {
            System.out.print("Sayı giriniz: ");
            S = input.nextInt();
        } while (S<=7);
        
        for (int a = 0; a <= (double)(S/3); a++) 
        {
            for (int b = 0; b <= (double)(S/5); b++) 
            {
                if (S==3*a+5*b) 
                {
                   System.out.println("3a+5b="+S+" denklemini sağlayan a değeri: "+a+", b değeri: "+b);
                }
              }
        }
        
    }
    
}

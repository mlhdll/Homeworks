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
public class W5Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sayi;
        
        do 
        {
            System.out.print("Pozitif bir tam sayı giriniz: ");
            sayi = input.nextInt();
        } while (sayi<1);
        
        for (int a = -sayi; a <= sayi; a++) 
        {
            for (int b = -sayi; b <= sayi; b++) 
            {
                if (sayi==Math.pow(a, 2)+Math.pow(b, 2)) 
                {
                    System.out.println(sayi+"=a^2+b^2 denklemini sağlayan a değeri: "+a+" b değeri: "+b);                    
                }
            }
        }
        
    }
    
}

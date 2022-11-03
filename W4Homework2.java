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
public class W4Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        
        for (int s = 1; s <= n; s++) 
        {
         t1 += s;
         
         if (s%2==0) 
        {
          t2 += s;                        
        }
         
         else 
        {
         t3 += s;
        } 
         
        }
        
        System.out.println(n+ " sayısına kadar olan sayıların toplamı: "+t1);
        System.out.println(n+ " sayısına kadar olan çift sayıların toplamı: "+t2);
        System.out.println(n+ " sayısına kadar olan tek sayıların toplamı: "+t3);
        
    }
    
}

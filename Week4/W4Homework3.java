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
public class W4Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kümenin eleman sayısını giriniz: ");
        int n = input.nextInt();
        
        System.out.print("Kaçlı kombinasyonlarının sayısını öğrenmek istiyosunuz: ");
        int r = input.nextInt();
        
        int c;
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        
        for (int s=1; s<=n; s++)
        {
          f1 *= s;
        }
        
        for (int s=1; s<=r; s++) 
        {
          f2 *= s;  
        }
        
        for (int s=1; s<=(n-r); s++) 
        {
          f3 *= s;
        }    
        
        c = f1/(f2*f3);
        
        System.out.println(n+" elemanlı bir kümenin "+r+"'li kombinasyonlarının sayısı: "+c); 
        
    }
    
}

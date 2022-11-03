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
public class W4Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int n  = input.nextInt();
        
        int kalan;
        
        while (n>0)
        {
            kalan = n%10;
            n = n/10;
            System.out.print(kalan);
        }
        
        
        
    }
    
}

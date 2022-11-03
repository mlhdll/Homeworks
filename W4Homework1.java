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
public class W4Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int a  = input.nextInt();
        
        for (int s=1; s<=a; s++) 
        {
           if (a%s==0)
           {
               System.out.print(s+" ");
           }
        }
        
        
        
        
    }
    
}

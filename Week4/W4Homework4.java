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
public class W4Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("f(x)=x^2-5x+3");
        System.out.print("Bir x değeri giriniz: ");
        int x = input.nextInt();
        int fx = (int) (Math.pow(x,2)-5*x+3);
        
        if (fx<0) 
        {
            System.out.println("f(x)<0");  
        }
        
        else if (fx>0) 
        {
            System.out.println("f(x)>0");  
        }
        
        else
        {
            System.out.println("f(x)=0");
        }
        
        
        
        
        
    }
    
}

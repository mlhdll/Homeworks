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
public class W7HomeworkX8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        int n=inp.nextInt();
        int toplam=0;
        
        for (int i = 1; i < n; i++) 
        {
            if(n%i==0)
            {
                toplam += i;
            }
        }
        if(toplam==n)
        {
            System.out.println("Mükemmel Sayıdır");
        }
    }
    
}

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
public class W7Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int BS,Tahmin,s=0;
        
        BS=(int)(Math.random()*98)+1;
        do {
            System.out.print("Tahminimiz: ");
            Tahmin = input.nextInt();
            s++;
            if (Tahmin>BS) {
                System.out.println("Daha küçük sayı giriniz...");
            }
            if (Tahmin<BS) {
                    System.out.println("Daha büyük sayı giriniz...");
                }
                System.out.println("");    
        } while (Tahmin!=BS);
        System.out.println(s+" tahminde buldunuz...");
        
    }
    
}

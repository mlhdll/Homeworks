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
public class W3Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan 1-7 arasında bir sayı al
           Adım 3: Kullanıcının girdiği sayıya göre ilgili yazıyı ekrana yazduır
           Adım 4: Dur
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("1-7 arasında bir sayı giriniz: ");
        int sayi = input.nextInt();
        
        if (sayi==1) {
            System.out.println("Pazartesi");  
        }
        else if (sayi==2) {
            System.out.println("Salı");
        }
        else if (sayi==3) {
            System.out.println("Çarşamba");
        }
        else if (sayi==4) {
            System.out.println("Perşembe");
        }
        else if (sayi==5) {
            System.out.println("Cuma");
        }
        else if (sayi==6) {
            System.out.println("Cumartesi");
        }
        else if (sayi==7) {
            System.out.println("Pazar");
        }
        else {
            System.out.println("Tanımsız sayı girildi.");
        }
        
        
        
    }
    
}

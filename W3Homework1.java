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
public class W3Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
           Adım 1: Başla
           Adım 2: Kullanıcıdan sayı al
           Adım 3: Sayıyı 0'dan büyük, küçük veya eşit olmasına göre sorgula
           Adım 4: Çıkan sonucu ekrana yazdır
           Adım 5: Dur
        */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        
        if (sayi==0) {
            
            System.out.println("Sayı sıfırdır.");   
        }
            
        else if (sayi<0) {
            
            System.out.println("Sayı negatiftir.");   
        }
        
        else {
            
            System.out.println("Sayı pozitiftir.");   
        }
        
    }
    
}

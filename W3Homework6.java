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
public class W3Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan sayi al
           Adım 3: Bir a sayısını 1 olarak tanımla
           Adım 4: a sayısı sayi'ye eşitlenene kadar a*a çarpımını toplam'a ekle
           Adım 5: Hesaplanan değeri ekrana yazdır
           Adım 6: Dur
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int toplam=0;
        int a=1;
        
        while (a<=sayi) {
            
            toplam += a*a;
            a++;
        }
        System.out.println(sayi+" sayısına kadar olan sayıların kareleri toplamı = "+toplam);
        
    }
    
}

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
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan kenar uzunluğu bilgisini al; k_uzunluk
           Adım 3: Kullanıcıdan o kenara ait yükseklik bilgisini al; k_yükseklik
           Adım 4: Kenar uzunluğu ve yüksekliği çarp ve ikiye böl
           Adım 5: Hesaplanan değeri ekrana yazdır
           Adım 6: Dur
        */ 
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Lütfen kenar uzunluğunu santimetre cinsinden giriniz: ");
        double k_uzunluk = input.nextDouble();
        
        System.out.println("Lütfen o kenara ait yüksekliği santimetre cinsinden giriniz: ");
        double k_yükseklik = input.nextDouble();
        
        System.out.println("Üçgenin alanı: "+(k_uzunluk * k_yükseklik / 2)+ " santimetrekaredir");
                
       
               
    }
    
}

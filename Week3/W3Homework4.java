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
public class W3Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan sayi1 al
           Adım 3: Bir a sayısı tanımla
           Adım 4: a sayısı sayi1'e eşitlenene kadar tek a sayılarını toplama ekle
           Adım 5: Hesaplanan değeri ekrana yazdır
           Adım 6: Dur
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sayi1 = input.nextInt();
        int a = 1;
        int toplam = 0;
        
        while (a<=sayi1) 
        {       
          if (a%2!=0) 
          {
              toplam += a;   
        } 
         a++;
        }
        System.out.println(sayi1+" sayısına kadar olan tek sayıların toplamı = "+toplam);
    }
    
}

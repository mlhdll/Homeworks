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
public class W3Homework5 {

    /**
     * @param args the command line arguments
    */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
           Adım 1: Başla
           Adım 2: Kullanıcıdan a, b sayısı al
           Adım 3: Bir c sayısını ve toplamı 0 olarak tanımla
           Adım 4: c sayısını kullanıcının girdiği 2. sayıya eşitlenene kadar artır
           Adım 5: c sayısı kullanıcının girdiği 2. sayıya eşitlenene kadar toplam'a 1. sayıyı ekle
           Adım 6: Hesaplanan değerleri ekrana yazdır
           Adım 7: Dur
        */
        Scanner input = new Scanner(System.in);
        
        System.out.println("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        
        System.out.println("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        
        int toplam = 0;
        int c = 0; 
        
        while (c<b) {
        c++;
        toplam += a; 
            
            
        }
        
        System.out.println(a + " x " + b + " = " + toplam);

        
       
        
        
        }
        
        
        
        
        
        
    }
    


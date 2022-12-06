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
public class Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
              YOĞUNLUK HESAPLAMA
           Adım 1: Başla
           Adım 2: Kullanıcıdan kütle bilgisini al; m
           Adım 3: Kullanıcıdan hacim bilgisini al; v
           Adım 4: m / v işlemini yaparak yoğunluğu bul; d
           Adım 5: Hesaplanan değeri ekrana yazdır
           Adım 6: Dur
        */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Maddenin kütlesini giriniz: ");
        double m = input.nextDouble();
        
        System.out.println("Maddenin hacmini giriniz: ");
        double v = input.nextDouble();
        
        double d = (m / v);
        System.out.println("Maddenin yoğunluğu "+d);
    }
    
}

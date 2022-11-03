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
public class Homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
               DÜŞEY ATIŞ
           Adım 1: Başla
           Adım 2: Kullanıcıdan ilk hız bilgisini al; v0
           Adım 3: Kullanıcıdan geçen süre bilgisini al; t
           Adım 4: Cismin ilk hızıyla yerçekimi ivmesini topla ve cismin t süre sonundaki hızını bul
           Adım 5: (v0 * t + 0.5 * 10 * t * t) işlemini yaparak cismin t sürede aldığı yolu bul
           Adım 6: Hesaplanan değerleri ekrana yazdır
           Adım 7: Dur
        */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cismin ilk hızını giriniz: ");
        int v0 = input.nextInt();
        
        System.out.println("Geçen süreyi saniye cinsinden giriniz: ");
        int t = input.nextInt();
        
        int v = (v0 + 10*t);
        double h = (v0 * t + 0.5 * 10 * t * t);
        System.out.println("Cismin "+t+" saniyede aldığı yol = "+h+" metre");
        System.out.println("Cismin "+t+" saniye sonraki hızı = "+v+" m/sn");
        
        
        
        
        
        
        
    }
    
}

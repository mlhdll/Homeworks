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
public class Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
               KAYNAMA NOKTASI YÜKSELMESİ
           Adım 1: Başla
           Adım 2: Kullanıcıdan molalite bilgisini al; v0
           Adım 3: Kullanıcıdan iyon sayısı bilgisini al; t
           Adım 4: Kaynama noktası yükselmesini bulmak için ebülyoskopi sabiti(0.52), iyon sayısı ve molaliteyi çarp
           Adım 5: Son durumdaki kaynama noktasını bulmak için kaynama noktası yükselmesini suyun kaynama noktası(100) ile topla 
           Adım 6: Hesaplanan değerleri ekrana yazdır
           Adım 7: Dur
        */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Çözeltinin molalitesini giriniz: ");
        double m = input.nextDouble();
        
        System.out.println("Çözünenin iyon sayısını giriniz: ");
        int ts = input.nextInt();
        
        double kn_yükselmesi = (0.52 * m * ts);
        System.out.println("Çözeltinin kaynama noktasındaki yükselme: "+kn_yükselmesi+" derece");
        System.out.println("Sulu çözeltinin son durumdaki kaynama noktası = "+(100 + kn_yükselmesi)+" derece");
        
    }
    
}

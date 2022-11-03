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
public class Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan hız bilgisini al; v
           Adım 3: Kullanıcıdan kütle bilgisini al; m
           Adım 4: Kullanıcıdan yükseklik bilgisini al; h
           Adım 5: Kinetik enerjiyi bulmak için 0.5 * m * v^2 işlemini yap; k_enerji
           Adım 6: Potansiyel enerjiyi bulmak için m * 10 * h işlemini yap; p_enerji
           Adım 7: Hesaplanan değerleri ekrana yazdır
           Adım 8: Dur
        */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cismin hızını giriniz:");
        int v = input.nextInt();
        
        System.out.println("Cismin kütlesini giriniz:");
        int m = input.nextInt();
        
        System.out.println("Cismin yerden yüksekliğini giriniz:");
        int h = input.nextInt();
        
        double k_enerji = (0.5 * m * v * v);
        int p_enerji = (m * 10 * h);
        
        System.out.println("Cismin kinetik enerjisi: "+k_enerji);
        System.out.println("Cismin potansiyel enerjisi: "+p_enerji);
        
    }
    
}

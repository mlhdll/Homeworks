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
public class Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan direnç bilgisini al; R
           Adım 3: Kullanıcıdan akım bilgisini al; i
           Adım 4: Gerilimi bulmak için i * R işlemini yap; V
           Adım 5: Hesaplanan değeri ekrana yazdır
           Adım 6: Dur
        */           
        Scanner input = new Scanner(System.in);
        
        System.out.println("İletkenin direncini giriniz: ");
        double R = input.nextDouble();
        
        System.out.println("İletken üzerinden geçen akımı giriniz: ");
        double i = input.nextDouble();
        
        double V = (i * R);
        System.out.println("Uçlar arasındaki gerilim "+V);
    }
    
}

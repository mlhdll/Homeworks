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
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan derece bilgisini al; derece
           Adım 3: Dereceyi 3.14 ile çarpıp 180'e böl; radyan
           Adım 4: Dereceyi 200 ile çarpıp 180'e böl; gradyan
           Adım 5: Hesaplanan değerleri ekrana yazdır
           Adım 6: Dur
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Derece giriniz: ");
        int derece = input.nextInt();
        double radyan = (derece * 3.14 / 180);
        double gradyan = (derece * 200 / 180);
        
        System.out.println("Derecenin radyan cinsinden değeri: "+radyan + " Derecenin gradyan cinsinden değeri: "+gradyan);
        
                
        
        
    }
    
}

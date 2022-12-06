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
public class W3Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan k1, k2, k3 al
           Adım 3: Girilen herhangi iki kenar birbirine eşitse ikizkenar olduğunu yazdır
           Adım 4: Girilen tüm kenarlar aynıysa eşkenar olduğunu yazdır
           Adım 5: Girilen tüm kenarlar farklıysa çeşitkenar olduğunu yazdır
           Adım 6: Dur
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("İlk kenar uzunluğunu giriniz: ");
        int k1 = input.nextInt();
        
        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        int k2 = input.nextInt();
        
        System.out.println("Üçüncü kenar uzunluğunu giriniz: ");
        int k3 = input.nextInt();
        
        
        
        if ((k1==k2) && (k2==k3)) {
        System.out.println("Üçgen eşkenar bir üçgendir.");    
        }
        else if ((k1==k2) || (k1==k3) || (k2==k3)) {
        System.out.println("Üçgen ikizkenar bir üçgendir.");
        }
        else {
        System.out.println("Üçgen çeşitkenar bir üçgendir.");
        }
        
        
    }
    
}

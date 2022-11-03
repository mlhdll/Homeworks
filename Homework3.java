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
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Adım 1: Başla
           Adım 2: Kullanıcıdan yarıçap bilgisini al; yarıçap
           Adım 3: Hacimi bulmak için 4 / 3 * 3.14 * yarıçap^3 işlemini yap; hacim
           Adım 4: Alanı bulmak için 4 * 3.14 * yarıçap^2 işlemini yap; alan 
           Adım 5: Hesaplanan değerleri ekrana yazdır
           Adım 6: Dur
        */  
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen kürenin yarıçapını giriniz: ");
        int yarıçap = input.nextInt();
        double hacim = (4 / 3 * 3.14 * yarıçap * yarıçap * yarıçap); 
        double alan = (4 * 3.14 * yarıçap * yarıçap);
        
        System.out.println("Kürenin Hacmi: "+hacim);
        
        System.out.println("Kürenin Alanı: "+alan);
               
    }
    
}

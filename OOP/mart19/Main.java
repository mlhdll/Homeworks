/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mart19;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ogrenci ogrenci1 = new Ogrenci(123,"Melike");
        Ogrenci ogrenci2 = new Ogrenci(543,"Ali");
        
        new Ev();
        new Ev(444);
        new Ev(123,"Filiz");
                
    }
    
}

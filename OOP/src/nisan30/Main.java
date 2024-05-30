/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nisan30;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        
        araba1.setKapiSayisi(2);
        
        System.out.println(araba1.getKapiSayisi());
        System.out.println(araba1.getTekerSayisi());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mart12;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araclar.Binek.Hb binek1 = new Araclar.Binek.Hb();
        System.out.println(binek1.motorHacmi);
        
        Araclar.Ticari.Agir ticari1 = new Araclar.Ticari.Agir();
        System.out.println(ticari1.vergi);
    }
    
}

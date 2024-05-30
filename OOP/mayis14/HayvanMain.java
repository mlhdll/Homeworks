/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayis14;

/**
 *
 * @author LENOVO
 */
public class HayvanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Hayvan hayvan1 = new Kedi();
        //Hayvan hayvan2 = new Kaplumbaga();
        //Beslen b1 = new Beslen();
        //b1.Besle(hayvan1);
        //b1.Besle(hayvan2);
        
        /*Hayvan hayvan1 = new Kaplumbaga();
        
        if (hayvan1 instanceof Kedi) {
            Kedi kedi1 = (Kedi) hayvan1;
            kedi1.Miyavla();
        }
        else if (hayvan1 instanceof Kaplumbaga){
            Kaplumbaga k1 = (Kaplumbaga) hayvan1;
            System.out.println(k1.Besle());
        }*/
        
        //Hayvan hayvan4 = new Hayvan();
        //Kedi kedi1 = hayvan1();
        
        Hayvan hayvan1 = new Hayvan();
        Kedi kedi1 = (Kedi)hayvan1;
        kedi1.Miyavla();
        
    }
    
}

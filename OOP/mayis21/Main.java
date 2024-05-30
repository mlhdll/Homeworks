/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayis21;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        KiralikEv kiralik1 = new KiralikEv(120);
        System.out.println(kiralik1.getFiyat());
        
        SatilikEv satilik1 = new SatilikEv(120);
        System.out.println(satilik1.getFiyat());
        
        //Ev ev1 = new Ev();
        //System.out.println(ev1.getFiyat());
        
        //FiyatHesapla fiyat1 = new FiyatHesapla();
        //KiralikEv kiralik1 = new KiralikEv(100);
        //fiyat1.Fiyat(kiralik1);
        
        //KiralikEv kiralik1 = new KiralikEv(150);
        //System.out.println(kiralik1.getFiyat());
        
    }
    
}

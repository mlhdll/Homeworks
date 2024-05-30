/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class EvMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Ev yazlikEv = new Ev();
         yazlikEv.yaz();
         
         yazlikEv.kapiNo = 334;
         yazlikEv.sokakAdi = "Tufan";
         yazlikEv.yaz();
         
         Ev kislikEv = new Ev();
         kislikEv.yaz();
         
         Ev tmp = new Ev();
         tmp = yazlikEv;
         yazlikEv = kislikEv;
         yazlikEv.yaz();
         tmp.yaz();
    }
    
}

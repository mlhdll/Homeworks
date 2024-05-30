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
public class KiralikEv extends Ev{
    
    public KiralikEv(int metrekare) {
        super.metrekare=metrekare;
    }
    
    @Override
    public double getFiyat(){
        return metrekare*50;
    }
    
    //@Override
    //public String getIsim(){
    //    return "Kiralık";
    //}

    @Override
    public double KrediliEv() {
        //
        return 0;
    }
    
}

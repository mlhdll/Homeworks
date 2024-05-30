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
public class SatilikEv extends Ev {
    
    public SatilikEv(int metrekare) {
        super.metrekare=metrekare;
    }
    
    @Override
    public double getFiyat(){
        return metrekare*5000;
    }
    
    //@Override
    //public String getIsim(){
    //    return "Satılık";
    //}

    @Override
    public double KrediliEv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

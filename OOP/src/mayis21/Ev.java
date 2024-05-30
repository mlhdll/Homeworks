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
public abstract class Ev {
    
    private double fiyat;
    int metrekare;
    
    public abstract double KrediliEv();
    
    public double getFiyat() {
        return fiyat;
    }
    
    public void setFiyat(double fiyat){
        this.fiyat=fiyat;
    }
    
    //public String getIsim(){
    //  return "isim";    
    //}
    
}

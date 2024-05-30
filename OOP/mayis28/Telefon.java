/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayis28;

/**
 *
 * @author LENOVO
 */
public abstract class Telefon {
    
    protected String marka;
    protected String model;
    protected int fiyat;
    
    public Telefon(String marka,String model, int fiyat){
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }
    
    public abstract void aramaYap(String numara);
    public abstract void mesajGonder(String numara, String icerik);
    
    public String getMarka(){
        return marka;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getFiyat(){
        return fiyat;
    }
    
}

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
public abstract class TelefonAbstract implements TelefonNew{
    
    protected String marka;
    protected String model;
    protected int fiyat;
    
    public TelefonAbstract(String marka,String model, int fiyat){
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }
    
    public abstract void ozellikGoster();
    
     public void aramaYap(String numara) {
        System.out.println(model+" ile " +numara+ " numarasını arıyor");
    }

    public void mesajGonder(String numara, String icerik) {
        System.out.println(model+" ile " +numara+ " numarasına " +icerik+ " mesajı gönderiliyor");
    }
    
    public int getFiyat(){
        return fiyat;
    }
    
}

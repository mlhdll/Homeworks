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
public class Samsung extends TelefonAbstract{
    
    public Samsung(String model, int fiyat){
        super("Samsung", model, fiyat);
    }

    //public void aramaYap(String numara) {
    //    System.out.println(getMarka()+ " " +getModel()+ " ile " +numara+ " numarasını arıyor");
    //}

    //public void mesajGonder(String numara, String icerik) {
    //    System.out.println(getMarka()+ " " +getModel()+ " ile " +numara+ " numarasına " +icerik+ " mesajı gönderiliyor");
    //}

    @Override
    public void ozellikGoster() {
        System.out.println(model+ " " +fiyat+ " TL");
    }
    
}

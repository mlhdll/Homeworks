/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nisan30;

/**
 *
 * @author LENOVO
 */
public class Araba extends AtArabasi{
    
    private int kapiSayisi;
    
    public int getKapiSayisi(){
        return kapiSayisi;
    }
    
    public void setKapiSayisi(int kapiSayisi){
        this.kapiSayisi = kapiSayisi;
    }
    
    @Override
    public int getTekerSayisi(){
        return 6;
    }
    
}

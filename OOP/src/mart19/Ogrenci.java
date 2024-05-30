/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mart19;

/**
 *
 * @author LENOVO
 */
public class Ogrenci {
    
    private int ogrenciNo;
    private String isim;
    
    public Ogrenci(int ogrenciNo, String isim){
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        System.out.println(this.isim+" "+this.ogrenciNo);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mart12.ornek2;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.ogrenciNo = 123;
        ogrenci1.isim = "Melike";
        
        Ders ders1 = new Ders();
        ders1.dersId = 1;
        ders1.dersAdi = "Nesne Yönelimli Programlama";
        
        Bolum bolum1 = new Bolum();
        bolum1.bolumIsmi = "Yazılım Mühendisliği";
        
        ogrenci1.ogrenciBolum = bolum1;
        bolum1.bolumOgrenciler = new Ogrenci[100];
        bolum1.bolumOgrenciler[0] = ogrenci1;
        
        ders1.dersBolum = bolum1;
        bolum1.bolumDersler = new Ders[10];
        bolum1.bolumDersler[0] = ders1;
        
        ogrenci1.ders = new Ders[7];
        ogrenci1.ders[0] = ders1;
        
        ders1.ogrenci = new Ogrenci[100];
        ders1.ogrenci[0] = ogrenci1;
        
        System.out.println(ogrenci1.isim+ " isimli öğrencinin aldığı ders " +ogrenci1.ders[0].dersAdi);
        System.out.println("Bölümün ilk dersi " +bolum1.bolumDersler[0].dersAdi);
        
        //ogrenci1.ders = ders1;
        //ders1.ogrenci = ogrenci1;
        
        //System.out.println(ogrenci1.ekranaYaz());
        //System.out.println(ders1.ekranaYaz());
    }
    
}

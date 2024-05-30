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
public class Ev {
    
    private int kapiNo;
    private String sokakAdi;
    
    public Ev(){
        this(123,"Menekşe");
    }
    
    public Ev(int kapiNo){
        this(kapiNo,"Lale");
    }
    
    public Ev(int kapiNo, String sokakAdi){
        this.kapiNo = kapiNo;
        this.sokakAdi = sokakAdi;
        System.out.println(this.kapiNo +" "+ this.sokakAdi);
    }
    
    
    
}

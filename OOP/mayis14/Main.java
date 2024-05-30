/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayis14;

/**
 *
 * @author LENOVO
 */
public class Main {

    public enum AlanKodu {
        ISPARTA ("ISP",246),ANTALYA("ANT",242),BURDUR("BRD",248);
        private String kisaltma;
        private int kod;
        
        AlanKodu(String kisaltma, int kod){
            this.kisaltma =  kisaltma;
            this.kod = kod;
        }
        
        public String getKisaltma(){
            return kisaltma;
        }
        
        public int getKod(){
            return kod;
        }
        
    }
    
    public static void main(String[] args) {
        
        AlanKodu aln = AlanKodu.ISPARTA;
        System.out.println(aln.getKisaltma());
        System.out.println(aln.getKod());
        System.out.println(aln.name());
        System.out.println(aln.ordinal());
        for (AlanKodu a: AlanKodu.values()) {
            System.out.println(a.name());
        }
                
    }
    
}

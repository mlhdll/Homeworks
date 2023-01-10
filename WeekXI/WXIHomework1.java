/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melih
 */
public class WXIHomework1 {
    
   public static void karetpl(int N){
        int tpl = 0;
        for (int i = 0; i <= N; i++) {
            tpl += Math.pow(i, 2);
        }
        System.out.println("1'den "+N+"'e kadar olan sayıların toplamı: "+tpl);
        
    }
    
    public static void main(String[] args) {
        
        karetpl(5);
        
    }
    
}

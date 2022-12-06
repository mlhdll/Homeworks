/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melih
 */
import java.util.*;
public class W7Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N, is; double aci,X,F,T=1;
        
        System.out.print("Açı değeri (derece): ");
        aci = input.nextDouble();
        
        System.out.print("Terim sayısı: ");
        N = input.nextInt();
        
        X=Math.toRadians(aci);
        is=1;
        
        for (int i = 1; i <= N-1; i++) {
            F=1;
            for (int j = 1; j <= 2*i; j++) {
                F*=j;
                is*=(-1);
                T+=is*Math.pow(X, 2*i)/F;
            }
        }
        System.out.printf("\nSeri açılımı ile hesaplanan değer: %.5f\n",T);
        System.out.printf("Komutla hesaplanan değer: %.5f\n",Math.cos(X));
        
        
    }
    
}

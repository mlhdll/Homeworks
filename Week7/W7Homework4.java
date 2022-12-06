/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melih
 */
import java.util.Scanner;
public class W7Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N;
        double x,T=1,F=1;
        
        System.out.println("Terim sayısını giriniz: ");
        N = input.nextInt();
        
        System.out.println("Hesaplanacak x değerini giriniz: ");
        x = input.nextInt();
        
        for (int i = 1; i < N; i++) {
            F*=i;
            T+=Math.pow(x,i)/F;
        }
        System.out.printf("\nSeri açılımı ile e üzeri x değeri: %.5f\n",T);
        System.out.printf("Komutla e üzeri x değeri: %.5f\n",Math.exp(x));
    }
    
}

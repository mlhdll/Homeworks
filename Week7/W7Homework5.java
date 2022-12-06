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
public class W7Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        double x,n,sonuc;
        
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
        
        System.out.print("x: ");
        x = inp.nextDouble();
        
        System.out.print("n: ");
        n = inp.nextDouble();
        
        sonuc = Math.pow((1+x/n),n);
        System.out.printf("\nexp(%f)=%f\n",x,sonuc);
    }
    
}

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
public class W7HomeworkX7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        int a,b=2;
        
        System.out.print("Pozitif tamsayı: ");
        a = inp.nextInt();
        System.out.println();
        
        while (a > 1) {
            if (a%b==0) {
                System.out.printf("%d\t",b);
                a/=b;
            }
            else {
                b++;
            }
        }
    }
    
}

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
public class W4Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Metre cinsinden uzunluk giriniz: ");
        int m = input.nextInt();
        
        System.out.println("1: m->mm\n2: m-cm\n3: m->dm\n4: m->km");
        
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        int islem = input.nextInt();
        
        
        if (islem==1)
        {
            int mm = m * 1000;
            System.out.println(m+ " metre = "+mm+" milimetredir");            
        }
        
        else if (islem==2)
        {
            int cm = m * 100;
            System.out.println(m+ " metre = "+cm+" santimetredir");            
        }
        
        else if (islem==3)
        {
            int dm = m * 10;
            System.out.println(m+ " metre = "+dm+" desimetredir");            
        }
        
        else if (islem==4)
        {
            double km = (double) m / 1000;
            System.out.println(m+ " metre = "+km+" kilometredir");            
        }
        
        else
        {
            System.out.println("Geçersiz işlem girdiniz");            
        }
        
        
        
        
        
    }
    
}

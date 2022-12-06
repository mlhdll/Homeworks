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
public class W7HomeworkX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double t = 1;
        for (int i = 1; i <= n; i++)
        {
            t = 4+1/t;
        }
        System.out.println(2+1/t);
    }
    
}

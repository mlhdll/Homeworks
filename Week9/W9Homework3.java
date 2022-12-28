import java.util.Scanner;
public class W9Homework3 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Bir ifade giriniz: ");
        String ifade = inp.nextLine();
        
        int sayac = 1;
        for (int i = 0; i < ifade.length(); i++) 
        {
            if(i%2==0)
            {
                sayac *= -1;
            }
            if (sayac==1) 
            {
                System.out.print(Character.toLowerCase(ifade.charAt(i)));
            }
            if(sayac==-1)
            {
                System.out.print(Character.toUpperCase(ifade.charAt(i)));
            }
        }
    }
    
}

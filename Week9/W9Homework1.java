import java.util.Scanner;
import java.util.Random;
public class W9Homework1 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Bir ifade giriniz: ");
        String ifade = inp.nextLine();
        
        for (int i = 0; i < ifade.length(); i++) 
        {
            if(random.nextInt(2)%2==0)
            {
                System.out.print(Character.toLowerCase(ifade.charAt(i)));
            }
            else
            {
                System.out.print(Character.toUpperCase(ifade.charAt(i)));
            }
        }
    }
    
}

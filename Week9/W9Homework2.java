import java.util.Scanner;
public class W9Homework2 {
    public static void main(String[] args) {
        
        Scanner inp =new Scanner(System.in);
        
        System.out.println("Bir ifade giriniz: ");
        String ifade = inp.nextLine();
        
        for (int i = 0; i < ifade.length(); i++) 
        {
            if(Character.toLowerCase(ifade.charAt(i))== ifade.charAt(i))
            {
                System.out.print(Character.toUpperCase(ifade.charAt(i)));
            }
            else
            {
                System.out.print(Character.toLowerCase(ifade.charAt(i)));
            }
        }
    }
    
}

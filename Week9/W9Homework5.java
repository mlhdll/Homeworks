import java.util.Scanner;
public class W9Homework5 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Bir ifade giriniz: ");
        String ifade=inp.nextLine();
        
        int s = ifade.length();
        
        String ilk = "";
        
        for (int i = s/2; i >0 ; i--) 
        {
            ilk += ifade.charAt(i);
        }
        System.out.println(ilk);
        
        String son = "";
        
        for (int i = s; i > s/2 ; i--) 
        {
            son += ifade.charAt(i);
        }
        System.out.println(ilk + son);
    }
    
}

import java.util.Scanner;
public class W9Homework4 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        char[] sesli={'a','e','ı','i','o','ö','u','ü'};
        
        System.out.println("Bir ifade giriniz: ");
        String ifade = inp.nextLine();
        
        String k1="";
        String k2="";
        
        for (int i = 0; i < ifade.length(); i++) 
        {
            boolean k =false;
            for (int j = 0; j < sesli.length; j++) 
            {
                if(ifade.charAt(i) == sesli[j])
                {
                    k1 += ifade.charAt(i);
                    k = true;
                    break;
                }
            }
            if(k == false)
            {
                k2 += ifade.charAt(i);
            }
        }
        System.out.println(k1);
        System.out.println(k2);
    }
    
}

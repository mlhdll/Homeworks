import java.util.Scanner;
public class WXIHomework2 {

    public static boolean asalmi(int sayi) {
        int syc = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                syc++;
            }
        }
        if (syc == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int sayi = input.nextInt();

        if (asalmi(sayi)) {
            System.out.println(sayi + " Sayısı Asal Sayıdır.");
        } else {
            System.out.println(sayi + " Sayısı Asal Değildir.");
        }
    }
    
}

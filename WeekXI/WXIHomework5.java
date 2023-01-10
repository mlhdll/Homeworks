
import java.util.Random;
import java.util.Scanner;
public class WXIHomework5 {

    public static int[][] arr_tpl(int[][] arr1, int[][] arr2, int N) {

        int[][] arr = new int[N][N];
        for (int i = 0; i < arr1.length; i++) {
            int tpl = 0;
            for (int j = 0; j < arr1.length; j++) {
                tpl = arr1[i][j] + arr2[i][j];
                arr[i][j] = tpl;
            }
        }

        System.out.println("Dizinin elemanlar toplamı: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Dizilerin satır ve sütun sayısını giriniz: ");
        int A = input.nextInt();
        
        int arr1[][] = new int[A][A];
        int arr2[][] = new int[A][A];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                arr1[i][j] = r.nextInt(10);
                arr2[i][j] = r.nextInt(10);
            }
        }

        System.out.println("İlk dizinin elemanları");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("2. dizinin elemanları");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
        
        arr_tpl(arr1, arr2, A);
        
    }
    
}

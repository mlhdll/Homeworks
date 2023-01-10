
import java.util.Random;
public class WXIHomework3 {

    public static int[] arr_siralama(int arr[]) {

        //diziyi küçükten büyüğe sıralama
        int gecici;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]) {
                    gecici = arr[i];
                    arr[i] = arr[j];
                    arr[j] = gecici;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        
        Random r = new Random();
        
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(100);
        }
        
        arr_siralama(arr);
    }
    
}

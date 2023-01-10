
import java.util.Random;
public class WXIHomework4 {
    
    public static int[][] arr_atama(int N, int ub){
        Random r = new Random();
        
        int[][] arr = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = r.nextInt(ub);
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        return arr;
        
    }
    
    public static void main(String[] args) {
        
        arr_atama(5, 50);
        
    }
    
}

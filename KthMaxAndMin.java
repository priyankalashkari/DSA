//import java.util.Arrays;

public class KthMaxAndMin {
    public static void main(String[] args) {
        int arr[] = {23, 4, 34, 1, 25};
        int n = arr.length;
        int k = 3;

        // bubble-sort
        for(int i=0; i<(n-1); i++) {
            for(int j=0; j<(n-i-1); j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[k-1]);

        // or directly use
        // Arrays.sort(arr);
        // return arr[k-1];
    }
}

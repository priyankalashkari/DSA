import java.util.*;

public class MoveNegativeToOneEnd {
    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, -4, 5, 7, -1, -5};
        int left = 0, right = arr.length - 1;

        while(left < right) {
            while(arr[left] < 0) {
                left++;
            }

            while(arr[right] > 0) {
                right--;
            }

            if(left >= right) {
                break;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

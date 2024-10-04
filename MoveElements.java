import java.util.*;

public class MoveElements {
        public static void MoveNegativeToOneEnd(int arr[]) {
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

        public static void SegregateElements(int[] arr) {
            int temp[] = new int[arr.length];
            int posIndex = 0;

            for(int i=0; i<arr.length; i++) {
                if(arr[i] > 0) {
                    temp[posIndex++] = arr[i];
                }
            }

            for(int i=0; i<arr.length; i++) {
                if(arr[i] < 0) {
                    temp[posIndex++] = arr[i];
                }
            }

            for(int i=0; i<arr.length; i++) {
                arr[i] = temp[i];
            }
            System.out.println(Arrays.toString(arr));
        }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, -4, 5, 7, -1, -5};

        MoveNegativeToOneEnd(arr);
        SegregateElements(arr);
    }
}

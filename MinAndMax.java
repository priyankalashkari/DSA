
public class MinAndMax {
    public static void findMinAndMax(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        if (arr == null || arr.length == 0) {
            return;
        }
        for(int i=1; i<arr.length; i++) {
            min = Math.min(min, arr[i]); 
            max = Math.max(max, arr[i]);
        }
        System.out.println(min + " Minimum");
        System.out.println(max + " Maximum");
    }
    public static void main(String[] args) {
        int arr[] = {1, 23, 36, 26, 23, 47};
        findMinAndMax(arr);
    }
}

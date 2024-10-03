public class SortColors {
    public static void sort_colors(int nums[]) {
        int zero=0, one=0, two=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zero++;
            }
            if(nums[i] == 1) {
                one++;
            }
            if(nums[i] == 2) {
                two++;
            }
        }

        for(int i=0; i<zero; i++) {
            nums[i] = 0;
        }

        for(int i=zero; i<one+zero; i++) {
            nums[i] = 1;
        }

        for(int i=one+zero; i<nums.length; i++) {
            nums[i] = 2;
        }
    }
    public static void main(String args[]) {
        int nums[] = { 0, 2, 1, 1, 1, 2, 2, 2, 0, 0};
        sort_colors(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

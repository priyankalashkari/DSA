public class RemoveDuplicates {
    public static void remove_dup(int nums[]) {
        if(nums.length == 0) {
           System.out.println("0");
        }

        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        
        for(int i = 0; i <= j; i++) {
            System.out.print(nums[i] + " ");
        }
        
        System.out.println("\nNew array length: " + (j + 1));
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 3, 3, 4, 4, 4};
        remove_dup(nums);
    }
}

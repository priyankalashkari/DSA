class FirstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = {23, 6, 7, 6, 5, 6};
        int target = 6;

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(target == arr[i]) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Target not found in the array.");
            return;
        }

        int indices[] = new int[count];
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(target == arr[i]) {
                indices[index++] = i;
            }
        }

        System.out.println("First position of target: " + indices[0]);
        System.out.println("Last position of target: " + indices[indices.length - 1]);
    }
}

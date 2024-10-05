import java.util.*;

public class ReverseInteger {
    public static void reverse(int num) {
        int result = 0, rem; 
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while (num != 0) {
            rem = num % 10;
            result = (result * 10) + rem;
            num = num / 10;

            if (result > max / 10 || (result == max / 10 && rem > 7)) {
                System.out.println("0"); // Overflow
            }
            if (result < min / 10 || (result == min / 10 && rem < -8)) {
                System.out.println("0"); //underflow 
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        System.out.print("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
        sc.close();
    }
}

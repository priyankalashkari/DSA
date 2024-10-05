import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int n, isPalin, s=0, rem;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        isPalin = n;

        while (n>0) {
           rem = n % 10;
           s = (s * 10) + rem;
           n = n/10; 
        }

        if( isPalin == s) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0) {
           System.out.println("0");
        }
        if(n==1) {
            System.out.println("0");
        }

        int nextTerm=0;

        for(int i=2; i<=n; i++) {
            System.out.print(a + " ");
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        
        sc.close();
    }
}

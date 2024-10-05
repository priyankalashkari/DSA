import java.util.ArrayList;

public class GenerateIP {
    public ArrayList<String> genIP(String s) {
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();

        // If the string length is not within the valid range for IP addresses
        if (n < 4 || n > 12) {
            ans.add("-1");
            return ans;
        }

        // Try placing three dots at different positions
        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k, n);

                    // Check if all four parts are valid
                    if (validx(a) && validx(b) && validx(c) && validx(d)) {
                        ans.add(a + "." + b + "." + c + "." + d);
                    }
                }
            }
        }

        // If no valid IP addresses were found, return "-1"
        if (ans.isEmpty()) {
            ans.add("-1");
        }
        
        return ans;
    }

    // Helper method to check if a part of the IP address is valid
    boolean validx(String s) {
        int n = s.length();
        if (n == 0 || n > 3 || (s.charAt(0) == '0' && n > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        GenerateIP ipGenerator = new GenerateIP();
        
        // Test case 1
        String s1 = "11211";
        System.out.println("Possible IPs for 11211: " + ipGenerator.genIP(s1));
        
        // Test case 2
        String s2 = "1111";
        System.out.println("Possible IPs for 1111: " + ipGenerator.genIP(s2));
        
        // Test case 3
        String s3 = "55";
        System.out.println("Possible IPs for 55: " + ipGenerator.genIP(s3));
    }
}

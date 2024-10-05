public class IntToRoman {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<values.length; i++) {
            while(num >= values[i]) {
                num = num - values[i];
                sb.append(romanLiterals[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 3456;
        System.out.println(intToRoman(num));
    }
}

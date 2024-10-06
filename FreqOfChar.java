public class FreqOfChar {
    // Count Character Occurrence
    public static void main(String[] args) {
        String s = "Java Programming";
        int total_count = s.length();
        int count_afterRemove = s.replace("a", "").length();
        int count = total_count - count_afterRemove;
        System.out.println(count);
    }
}

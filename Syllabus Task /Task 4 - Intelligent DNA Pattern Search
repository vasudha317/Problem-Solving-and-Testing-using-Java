public class Main {

    static boolean match(String text, String pattern, int start) {
        for (int j = 0; j < pattern.length(); j++) {
            if (text.charAt(start + j) != pattern.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    static void search(String text, String pattern) {
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (match(text, pattern, i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        search(text, pattern);
    }
}



Sample Input
AABAACAADAABAABA AABA
Sample Output
0 9 12

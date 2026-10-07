import java.util.*;

public class Main {

    static void countHashtags(String[] hashtags) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String tag : hashtags) {
            map.put(tag, map.getOrDefault(tag, 0) + 1);
        }

        for (String tag : map.keySet()) {
            System.out.println(tag + " " + map.get(tag));
        }
    }

    public static void main(String[] args) {

        String[] hashtags = {"java", "python", "java", "ai", "python"};

        countHashtags(hashtags);
    }
}


Sample Input
5 java python java ai python
Sample Output
java 2 python 2 ai 1

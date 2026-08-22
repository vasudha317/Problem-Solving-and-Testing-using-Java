import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        Predicate<String[]> validLogin = user ->
                user[0].equals("admin") &&
                user[1].equals("admin123") &&
                user[0].length() >= 3 &&
                user[0].length() <= 20 &&
                user[1].length() >= 6 &&
                user[1].length() <= 20;

        List<String[]> attempts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            attempts.add(sc.nextLine().trim().split("\\s+"));
        }

        attempts.stream()
                .map(user -> validLogin.test(user) ? "SUCCESS" : "FAILURE")
                .forEach(System.out::println);
    }
}



Sample Input

3
admin admin123
ab 123
user pass

Output

SUCCESS
FAILURE
FAILURE



import java.util.Arrays;
import java.util.Scanner;

public class SalaryTransformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] salaries = new int[n];

       
        Arrays.setAll(salaries, i -> sc.nextInt());

        Arrays.stream(salaries)
              .map(salary -> salary + salary / 10)
              .forEach(salary -> System.out.print(salary + " "));
    }
}


Input:
5
10000 20000 30000 40000 50000

Output:
11000 22000 33000 44000 55000

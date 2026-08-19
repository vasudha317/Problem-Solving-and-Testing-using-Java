import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        BiFunction<Integer, Integer, Integer> divide = (a, b) -> a / b;

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();

        String operator = sc.next();

        int b = sc.nextInt();

        int result = 0;

        if (operator.equals("+")) {
            result = add.apply(a, b);
        } 
        else if (operator.equals("/")) {
            result = divide.apply(a, b);
        }


        if (operator.equals("+") && result == a + b) {
            System.out.println("Test Passed");
        } 





        else if (operator.equals("/") && result == a / b) {
            System.out.println("Test Passed");
        } 
        else {
            System.out.println("Test Failed");
        }

        sc.close();
    }
}



INPUT
10 + 20

OUTPUT
Test Passed

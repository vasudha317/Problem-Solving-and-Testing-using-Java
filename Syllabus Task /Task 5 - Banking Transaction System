import java.util.Scanner;

public class Main {

    static int deposit(int balance, int amount) {
        return balance + amount;
    }

    static int withdraw(int balance, int amount) {
        return balance - amount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int balance = 0;

        for (int i = 0; i < n; i++) {

            String operation = sc.next();
            int amount = sc.nextInt();

            if (operation.equals("Deposit")) {
                balance = deposit(balance, amount);
            } 
            else if (operation.equals("Withdraw")) {
                balance = withdraw(balance, amount);
            }
        }

        System.out.println(balance);
    }
}


Sample Input
3 Deposit 5000 Withdraw 2000 Deposit 1000
Sample Output
4000

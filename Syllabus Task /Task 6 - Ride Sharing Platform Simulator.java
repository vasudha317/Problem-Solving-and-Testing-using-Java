import java.util.Scanner;

public class Main {

    static int calculateFare(String type, int distance) {

        if (type.equals("Bike")) {
            return distance * 5;
        }
        else if (type.equals("Cab")) {
            return distance * 12;
        }
        else if (type.equals("Auto")) {
            return distance * 12;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int distance = sc.nextInt();

            int fare = calculateFare(type, distance);

            if (fare == -1) {
                System.out.println("Invalid Booking");
            }
            else {
                System.out.println(fare);
            }
        }
    }
}


Sample Input
3 Bike 10 Cab 15 Auto 8
Sample Output
50 180 96

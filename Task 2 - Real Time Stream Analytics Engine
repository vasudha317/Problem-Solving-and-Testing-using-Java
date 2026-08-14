import java.util.*;
import java.util.stream.*;

public class RealTimeStreamAnalyticsEngine {

    static class Reading {
        String sensorId;
        double temperature;

        Reading(String sensorId, double temperature) {
            this.sensorId = sensorId;
            this.temperature = temperature;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Reading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String sensorId = sc.next();
            double temperature = sc.nextDouble();

            readings.add(new Reading(sensorId, temperature));
        }

        readings.stream()

              
                .filter(r -> r.temperature > 50)

    
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingDouble(r -> r.temperature)
                ))

              
                .entrySet()
                .stream()

   
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())

            
                .forEach(entry ->
                        System.out.println(
                                entry.getKey() + " " + entry.getValue()
                        )
                );

        sc.close();
    }
}


Input:
6
S1 45.0
S1 60.0
S2 55.0
S2 65.0
S3 40.0
S3 80.0

Output:
S3 80.0
S1 60.0
S2 60.0

import java.util.*;
import java.util.function.Predicate;

public class Main {

    static boolean findRoute(List<List<Integer>> graph, int source, int destination) {

        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == destination) {
                return true;
            }

            graph.get(current).forEach(next -> {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            });
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

      
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        if (findRoute(graph, source, destination)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}




INPUT
5 4
1 2
2 3
3 4
4 5
1 5

OUTPUT
YES

import java.util.*;

public class DijkPrac {
    public static class Node implements Comparable<Node> {
        String vertex;
        int weight;

        public Node(String vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }
}

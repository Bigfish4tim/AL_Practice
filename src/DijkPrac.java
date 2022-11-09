import java.lang.reflect.Array;
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

    public static Map<String, Integer> dijFunc(Map<String, ArrayList<Node>> map, String start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Map<String, Integer> result = new HashMap<>();
        Node pqNode;
        ArrayList<Node> nodeList;

        Map<String, Integer> asc = Map.of(
                "A", 1,
                "B", 1,
                "C", 3,
                "D", 2,
                "E", 1
        );

        for(String key : map.keySet()) {
            result.put(key, Integer.MAX_VALUE);
        }
        result.put(start, 0);
        pq.add(new Node(start, 0));

        Map<String, Integer> sum = new HashMap<>();

        for(String key : map.keySet()) {
            sum.put(key, 0);
        }

        sum.put(start, asc.get(start));

        while (!pq.isEmpty()) {
            pqNode = pq.poll();
            if(result.get(pqNode.vertex) < pqNode.weight) {
                continue;
            }
            nodeList = map.get(pqNode.vertex);

            for(Node searchNode : nodeList) {
                int newWeight = searchNode.weight + pqNode.weight;
                if(newWeight <= result.get(searchNode.vertex)) {
                    result.put(searchNode.vertex, newWeight);
                    pq.add(new Node(searchNode.vertex, newWeight));

                    int totalwater = asc.get(searchNode.vertex) + sum.get(pqNode.vertex);
                    if(totalwater > sum.get(searchNode.vertex)) {
                        sum.put(searchNode.vertex, totalwater);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Node>> map = new HashMap<>();

        Node AB = new Node("B", 2);
        Node AC = new Node("C", 1);
        Node AD = new Node("D", 5);

        Node BD = new Node("D", 1);
        Node CD = new Node("D", 2);


        Node DE = new Node("E", 2);

        ArrayList<Node> Agraph = new ArrayList<>();
        ArrayList<Node> Bgraph = new ArrayList<>();
        ArrayList<Node> Cgraph = new ArrayList<>();
        ArrayList<Node> Dgraph = new ArrayList<>();
        ArrayList<Node> Egraph = new ArrayList<>();

        Agraph.add(AB);
        Agraph.add(AC);
        Agraph.add(AD);

        Bgraph.add(BD);
        Cgraph.add(CD);

        Dgraph.add(DE);

        map.put("A", Agraph);
        map.put("C", Cgraph);
        map.put("B", Bgraph);
        map.put("D", Dgraph);
        map.put("E", Egraph);

        System.out.println(map);

        System.out.println(dijFunc(map, "A"));
    }
}

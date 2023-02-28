import java.util.*;

public class asdasdasd {
    public static <size> void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(6);
        pq.add(2);
        pq.add(5);
        pq.add(7);
        pq.add(4);
        pq.add(3);


        for(int i=0, size = pq.size(); i<size; i++) {
            System.out.println(pq.poll());
        }
    }
}

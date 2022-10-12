import java.util.*;

public class PriorityQueuePrac {

    public static void main(String[] args) {
        PriorityQueue<Integer> prio = new PriorityQueue<>();

        prio.add(18);
        prio.add(1);
        prio.add(7);
        prio.add(5);
        prio.add(10);
        prio.add(8);
        prio.add(15);

        System.out.println(prio);

        prio.remove();
        prio.remove();

        System.out.println(prio);
    }
}

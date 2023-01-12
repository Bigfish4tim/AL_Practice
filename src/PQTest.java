import java.util.*;

public class PQTest {

    public static class operator implements Comparable<operator> {
        int x;
        int y;
        int h;

        public operator(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        }


        @Override
        public int compareTo(operator o) {
            return this.h - o.h;
        }
    }

    public static int coint(int x) {
        if(x != 10) {
            return 1 + coint(++x);
        } else {
            return 1;
        }


    }

    public static void main(String[] args) {
//        PriorityQueue<operator> pq = new PriorityQueue<>();
//
//        operator a = new operator(3,2,1);
//        operator b = new operator(2,1,2);
//        operator c = new operator(1,2,-3);
//
//        pq.offer(a);
//        pq.offer(b);
//        pq.offer(c);
//
//        System.out.println(Objects.requireNonNull(pq.poll()).h);
//        System.out.println(Objects.requireNonNull(pq.poll()).h);
//        System.out.println(Objects.requireNonNull(pq.poll()).h);

        System.out.println(coint(0));


    }
}

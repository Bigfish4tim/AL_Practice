import java.util.*;

public class arraymult {
    public static class obj implements Comparable<obj> {
        int x;
        char k;

        public obj(int x, char k) {
            this.x = x;
            this.k = k;
        }

        public int getX() {
            return this.x;
        }

        public char getK() {
            return this.k;
        }

        @Override
        public int compareTo(obj o) {
            if(this.k > o.getK())
                return 1;
            else if(this.k < o.getK())
                return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        String[] a = {"1", ".", "2", "."};

        PriorityQueue<obj> q = new PriorityQueue<>();

        q.add(new obj(10, '3'));
        q.add(new obj(5, '2'));
        q.add(new obj(11, '5'));
        q.add(new obj(51, '1'));


        while (!q.isEmpty()) {
            obj temp = q.poll();
            System.out.println(temp.x);
        }

//        Integer[] arr = {1, 2, 3, 4, 5};
//
//        Integer[] copy = arr.clone();
//
//        copy[2] = arr[1];
//
//        System.out.println("arr:" + Arrays.toString(arr));
//        System.out.println("copy:" + Arrays.toString(copy));

        char e1 = '1';
        char e2 = '2';

        if(e1<e2) {
            System.out.println('t');
        } else {
            System.out.println('f');
        }

        System.out.println(Integer.parseInt(a[0]));
        try {
            System.out.println(Integer.parseInt(a[1]));
        } catch (NumberFormatException e) {
            System.out.println("not Num");
        }
    }
}

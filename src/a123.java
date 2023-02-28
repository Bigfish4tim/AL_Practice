import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a123 {
    static int n;
    static PriorityQueue<Balloon> pq;
    static class Balloon implements Comparable<Balloon>{
        int l, d;
        public Balloon(int l, int d){
            this.l = l;
            this.d = d;
        }
        @Override
        public int compareTo(Balloon o) {
            return Integer.compare(this.l, o.l);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int l = sc.nextInt();
            int d = sc.nextInt();
            pq.add(new Balloon(l, d));
        }
        int cnt = 0, pos = 0;
        while(!pq.isEmpty()){
            Balloon balloon = pq.poll();
            if(balloon.l > pos) {
                pos = balloon.l;
            }
            if(balloon.d >= pos){
                cnt++;
                pos += balloon.d;
            }
        }
        System.out.println(cnt);
    }
}

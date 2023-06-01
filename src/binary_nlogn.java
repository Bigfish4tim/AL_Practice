import java.util.Arrays;
import java.util.Scanner;

public class binary_nlogn {
    static class Pair implements Comparable<Pair>{
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.first > o.first) return 1;
            else if (this.first < o.first) return -1;
            else return Integer.compare(this.second, o.second);
        }
    }

    static int n, k;
    static Pair[] a;
    static int[] nxt;
    static final int MAXN = 250005;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new Pair[MAXN];
        nxt = new int[MAXN];

        for (int i = 1; i <= n; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            a[i] = new Pair(first, second);
        }

        Arrays.sort(a, 1, n+1);

        for (int i = n; i > 0; i--) {
            nxt[i] = i;
            if (i + 1 <= n && a[i].first == a[i + 1].first)
                nxt[i] = nxt[i + 1];
        }

        long s = 0, e = (1L << 61);
        while (s != e) {
            long m = (s + e) / 2;
            if (trial(m) <= k)
                e = m;
            else
                s = m + 1;
        }

        System.out.println(s);
    }

    static long dist(Pair x, Pair y) {
        int dx = x.first - y.first;
        int dy = x.second - y.second;
        return 1L * dx * dx + 1L * dy * dy;
    }

    static long ccw(Pair a, Pair b, Pair c) {
        int dx1 = b.first - a.first;
        int dy1 = b.second - a.second;
        int dx2 = c.first - a.first;
        int dy2 = c.second - a.second;
        return 1L * dx1 * dy2 - 1L * dy1 * dx2;
    }

    static boolean awkward(Pair s1, Pair e1, Pair s2, Pair e2) {
        return ccw(new Pair(0, 0), new Pair(e1.first - s1.first, e1.second - s1.second),
                new Pair(e2.first - s2.first, e2.second - s2.second)) >= 0;
    }

    static long cost(int s, int e) {
        if (s > e)
            return 0;
        e = nxt[e];
        Pair[] v = new Pair[e - s + 1];
        Pair[] w = new Pair[e - s + 1];
        int vIdx = 0, wIdx = 0;

        for (int i = s; i <= e; i++) {
            while (vIdx >= 2 && ccw(v[vIdx - 2], v[vIdx - 1], a[i]) <= 0) {
                vIdx--;
            }
            v[vIdx++] = a[i];
        }

        for (int i = e; i >= s; i--) {
            while (wIdx >= 2 && ccw(w[wIdx - 2], w[wIdx - 1], a[i]) <= 0) {
                wIdx--;
            }
            w[wIdx++] = a[i];
        }

        for (int i = 1; i < wIdx - 1; i++)
            v[vIdx++] = w[i];

        long ret = 0;
        int p = 0;

        for (int i = 0; i < vIdx; i++) {
            while (p + 1 < vIdx && awkward(v[i], v[i + 1], v[p], v[p + 1])) {
                ret = Math.max(ret, dist(v[i], v[p]));
                p++;
            }
            ret = Math.max(ret, dist(v[i], v[p]));
        }

        return ret;
    }

    static int trial(long x) {
        int curlst = 0;
        int itr = 0;

        while (curlst < n) {
            itr++;
            int thres_st = 0;
            for (int i = 0; curlst + (1 << i) <= n; i++) {
                if (cost(curlst + 1, curlst + (1 << i)) <= x) {
                    thres_st = (1 << i);
                } else
                    break;
            }

            int thres_ed = Math.min(thres_st * 2, n - curlst);

            while (thres_st != thres_ed) {
                int m = (thres_st + thres_ed + 1) / 2;

                if (cost(curlst + 1, curlst + m) <= x) {
                    thres_st = m;
                } else
                    thres_ed = m - 1;
            }

            if (thres_st == 0)
                return 1_000_000_000;

            curlst += thres_st;
            curlst = nxt[curlst];
        }

        return itr;
    }
}

import java.util.*;

public class BFS {

    private static boolean[] visit;
    private static int[][] map;
    private static int n;

    public static void bfs_method(int i) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(i);

        visit[i] = true;
        System.out.println(i + " : i");

        while (!q.isEmpty()) {
            int temp = q.poll();
            for(int j=0; j< map.length; j++) {
                if(map[temp][j] == 1 && !visit[j]) {
                    q.offer(j);
                    visit[j] = true;
                    System.out.println(j + " : j");
                }
            }
        }
    }
    public static void dfs_method(int i) {
        visit[i] = true;

        System.out.println(i + " : i");

        for(int j=0; j< map.length; j++) {
            if(map[i][j] == 1 && !visit[j]) {
                dfs_method(j);
            }
        }
    }

    public static void main(String[] args) {
        visit = new boolean[5];
        n = 7;

        map = new int[5][5];

        map[0][1] = 1;
        map[1][0] = 1;

        map[0][2] = 1;
        map[2][0] = 1;

        map[0][4] = 1;
        map[4][0] = 1;

        map[1][2] = 1;
        map[2][1] = 1;

        map[2][3] = 1;
        map[3][2] = 1;

        map[2][4] = 1;
        map[4][2] = 1;

        map[3][4] = 1;
        map[4][3] = 1;

        bfs_method(0);
        dfs_method(0);
    }

}

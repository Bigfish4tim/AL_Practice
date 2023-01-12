import java.util.*;


public class arraytest {

    public static boolean isc(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        int[] x = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] y = new int[] {1,2,3,4,5,6};

        int[][] dx = new int[4][2];

        for(int i = 0; i<2; i++) {
            dx[i][0] =1;
            dx[i][1] =2;
        }

        char[] ch = new char[] {'a', ' ', 'b'};

        System.out.println(ch[0]);

        System.out.println(ch[1]);

        System.out.println(ch[2]);


    }

}

import java.util.*;

public class binary {

    public static int bisearch(int x) {
        int b = 2;
        int count = 1;

        while (x >= b) {
            b = b*2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 17;
        int c = 16;

//        System.out.println(Integer.toBinaryString(a)); //바이너리로 변환
//        System.out.println(Integer.toBinaryString(b)); //바이너리로 변환
        System.out.println("10진수 : " + (a | b));
        System.out.println("2진수 : " + Integer.toBinaryString(a | b));

        System.out.println(b/2);
        System.out.println(bisearch(c));
    }
}

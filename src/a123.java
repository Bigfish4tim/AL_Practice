import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class a123 {
    public static void main(String[] args) {

        ArrayList<Integer> q = new ArrayList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.removeIf(integer -> integer == 1);

//        Iterator<Integer> iter = q.iterator();
//        while (iter.hasNext()) {
//            if(iter.next() == 1) {
//                iter.remove();
//            }
//        }


        int x = 11;

        x = (x+1)/2;

        System.out.println(x);

/*

예제

3
1 4
1 5
9 2

2


4
0 1
0 2
0 3
0 4

1


6
1 6
2 1
3 5
4 1
5 1
9 3

5


8
1 1
2 3
2 8
2 9
3 4
7 3
8 1
9 3

5


6
1 7
2 6
3 5
4 4
5 3
6 2

2



8
0 1
0 8
1 3
1 4
2 8
4 2
4 1
5 5

4


8
0 8
0 1
1 3
1 4
2 8
4 2
4 1
5 5

5
4 9
8 1
8 1
8 1
8 1

5


7
0 4
4 4
8 1
8 1
8 1
8 1
13 1


 */

    }
}

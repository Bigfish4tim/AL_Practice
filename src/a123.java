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

//        q.removeIf(integer -> integer == 1);

//        Iterator<Integer> iter = q.iterator();
//        while (iter.hasNext()) {
//            if(iter.next() == 1) {
//                iter.remove();
//            }
//        }

        

        System.out.println(q.indexOf(3));


        int x = 11;

        x = (x+1)/2;

        System.out.println(x);

    }
}
/*
4 4
2 5 0
1 5 2
4 6 3
7 2 1

3 10
1 0 0
2 0 3
3 0 1

4 10
1 0 0
2 0 3
3 0 3
4 0 1

4 5
1 0 0
2 0 3
3 0 3
4 0 1

5 10
1 0 0
2 0 3
3 0 3
4 0 2
4 1 1


 */
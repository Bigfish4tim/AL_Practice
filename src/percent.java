import java.util.*;

public class percent {
    public static void math(ArrayList<Integer> results) {
        Random random = new Random();
        for (int i=0; i< 10000; i++) {
            int attempts = 0;
            boolean gotA = false;
            boolean gotB = false;

            for(int j=0; j<21; j++) {
                attempts++;
                for(int k=0; k<10; k++) {
                    double r = random.nextDouble();
                    if (r < 0.008) {
                        gotA = true;
                    }
                    if (r < 0.016 && r >= 0.008) {
                        gotB = true;
                    }
                }
                if (gotA && gotB) {
                    results.add(attempts);
                    break;
                }
            }
        }

    }

    public static ArrayList<Integer> math2(ArrayList<Integer> results) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int attempts = 0;
            boolean gotA = false;
            boolean gotB = false;
            while (!(gotA && gotB)) {
                attempts++;
                for(int j=0; j<10; j++) {
                    double r = random.nextDouble();
                    if (r < 0.008) {
                        gotA = true;
                    }
                    if (r < 0.016 && r >= 0.008) {
                        gotB = true;
                    }
                }
            }
            results.add(attempts);
        }
        return results;
    }

    public static void math3(ArrayList<Integer> results) {
        Random random = new Random();
        for (int i=0; i< 10000; i++) {
            int attempts = 0;
            boolean gotA = false;

            for(int j=0; j<20; j++) {
                attempts++;
                for(int k=0; k<10; k++) {
                    double r = random.nextDouble();
                    if (r < 0.008) {
                        gotA = true;
                    }
                }
                if (gotA) {
                    results.add(attempts);
                    break;
                }
            }
        }
    }

    public static void math4(ArrayList<Integer> results) {
        Random random = new Random();
        for (int i=0; i< 10000; i++) {
            int attempts = 0;
            boolean gotA = false;

            for(int j=0; j<20; j++) {
                attempts++;
                for(int k=0; k<10; k++) {
                    double r = random.nextDouble();
                    if (r < 0.008) {
                        gotA = true;
                    }
                }
                if (gotA) {
                    results.add(attempts);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {



        for(int i=0; i<20; i++) {
            ArrayList<Integer> results = new ArrayList<Integer>();
//            math(results);
            math3(results);

            System.out.println((double) results.size()/10000);
        }

        int a = 10;
        int b = 3;

        double c = (double) a/b;

        System.out.println(c);

        System.out.println(c+b);

        if (c < a) {
            System.out.println(11);
        }

//        math2(results);

//        results.sort(null);
//        int index = (int) (0.90 * results.size());
//        System.out.println("90th percentile: " + results.get(index));
    }
}


/*
10 10
1 1
2 5
3 9
5 1
11 1
22 4
55 7
1000 1
100001 1
2354571 1

10 2
1 1
2 2
3 3
4 4
5 5
10000 1
20000 1
25000 1
27000 1
30000 1
 */
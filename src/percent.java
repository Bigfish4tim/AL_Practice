import java.util.*;

public class percent {
    public static void math(ArrayList<Integer> results) {
        Random random = new Random();
        for (int i=0; i< 10000; i++) {
            int attempts = 0;
            boolean gotA = false;
            boolean gotB = false;

            for(int j=0; j<40; j++) {
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

    public static void main(String[] args) {



        for(int i=0; i<20; i++) {
            ArrayList<Integer> results = new ArrayList<Integer>();
            math(results);

            System.out.println((double) results.size()/10000);
        }


//        math2(results);

//        results.sort(null);
//        int index = (int) (0.90 * results.size());
//        System.out.println("90th percentile: " + results.get(index));
    }
}

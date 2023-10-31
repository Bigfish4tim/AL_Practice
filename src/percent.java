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

    public static void math5(ArrayList<Integer> results) {
        Random random = new Random();

        for (int i=0; i< 10000; i++) {
            int attempts = 0;
            boolean gotA = false;
            boolean gotB = false;
            double alpha = 0;
            int count = 0;

            int total = 0;

            for (int j=0; j<200; j++) {
                attempts++;
                count++;
                double r = random.nextDouble();

                if (count>=60) {
                    alpha = 0.0075 * (count-59);
                }

                if (!gotB) {
                    if (count == 70) {
                        double s = random.nextDouble();
                        if (s < 0.5) {
                            gotB = true;
                        } else {
                            gotA = true;
                        }
                        count = 0;
                        alpha = 0;
                    } else {
                        if (r < 0.0075 + alpha) {
                            gotA = true;
                            count = 0;
                            alpha = 0;
                        }
                        if (r < 0.015 + (2*alpha) && r >= 0.0075 + alpha) {
                            gotB = true;
                            count = 0;
                            alpha = 0;
                        }
                    }
                } else {
                    if (count == 70) {
                        gotA = true;
                        count = 0;
                        alpha = 0;
                    } else {
                        if (r < 0.015 + (2*alpha)) {
                            gotA = true;
                            count = 0;
                            alpha = 0;
                        }
                    }

                }

                if (gotA) {
                    total++;
                    gotA = false;
                    gotB = false;
                }

                if (total==2) {
                    results.add(attempts);
                    break;
                }
            }
        }
    }

    public static void math7(ArrayList<Integer> results) {
        Random random = new Random();
        for (int i=0; i< 10000; i++) {
            int attempts = 0;
            boolean gotA = false;
            boolean gotB = false;
            double alpha = 0;
            int count = 0;

            for (int j=0; j<75; j++) {
                attempts++;
                count++;
                double r = random.nextDouble();

                if (count>=45) {
                    alpha = 0.0025 * (count-44);
                }
                if (count == 75) {
                    gotA = true;
                    count = 0;
                    alpha = 0;
                } else {
                    if (r < 0.015 + (2*alpha)) {
                        gotA = true;
                        count = 0;
                        alpha = 0;
                    }
                }

                if (gotA) {
                    results.add(attempts);
                    break;
                }
            }
        }
    }

    public static void math6(ArrayList<Integer> results) {
        Random random = new Random();
        for (int i=0; i< 10000; i++) {
            int attempts = 0;
            boolean gotA = false;
            boolean gotB = false;
            double alpha = 0;
            int count = 0;
            int sum = 0;

            for (int j=0; j<290; j++) {
                attempts++;
                count++;
                double r = random.nextDouble();

                if (count>=45) {
                    alpha = 0.0025 * (count-44);
                }

                if (!gotB) {
                    if (count == 75) {
                        double s = random.nextDouble();
                        if (s < 0.5) {
                            gotB = true;
                        } else {
                            gotA = true;
                        }
                        count = 0;
                        alpha = 0;
                    } else {
                        if (r < 0.0075 + alpha) {
                            gotA = true;
                            count = 0;
                            alpha = 0;
                        }
                        if (r < 0.015 + (2*alpha) && r >= 0.0075 + alpha) {
                            gotB = true;
                            count = 0;
                            alpha = 0;
                        }
                    }
                } else {
                    if (count == 75) {
                        gotA = true;
                        count = 0;
                        alpha = 0;
                    } else {
                        if (r < 0.015 + (2*alpha)) {
                            gotA = true;
                            count = 0;
                            alpha = 0;
                        }
                    }
                }

                if (gotA) {
                    sum++;
                    gotA = false;
                    gotB = false;
                }

                if (sum == 2) {
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
            math5(results);
//            math6(results);
//            math7(results);

            System.out.println((double) results.size()/10000);

            int sum = 0;
            for (Integer result : results) {
                sum += result;
            }
            System.out.println(sum / 10000);
        }
//        math2(results);

//        results.sort(null);
//        int index = (int) (0.90 * results.size());
//        System.out.println("90th percentile: " + results.get(index));

//        // 두 점의 좌표를 입력합니다.
//        double x1 = 0.0;
//        double y1 = 0.0;
//        double x2 = 1.0;
//        double y2 = 0.0;
//
//        // 각도를 계산합니다.
//        double angleRadians = Math.atan2(y2 - y1, x2 - x1);
//        double angleDegrees = Math.toDegrees(angleRadians - Math.PI/4);
//
//        if (angleDegrees < 0) {
//            angleDegrees = 360 + angleDegrees;
//        }
//
//        // 결과를 출력합니다.
//        System.out.println("두 점 사이의 각도 (라디안): " + angleRadians);
//        System.out.println("두 점 사이의 각도 (도): " + angleDegrees);
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
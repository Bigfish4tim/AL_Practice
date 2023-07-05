public class DrawProbability {
    public static void main(String[] args) {
        int totalTrials = 200;
        int countA = 0;
        boolean pickedB = false;

        for (int i = 1; i <= totalTrials; i++) {
            if (i == 75 && !pickedB) {
                // 74번째 뽑기까지 A나 B를 뽑지 못했고 이미 B를 뽑지 않은 상태라면 75번째에서 A 뽑기
                countA++;
            } else {
                double probability = getProbability(i, pickedB);
                if (Math.random() <= probability) {
                    countA++;
                    if (pickedB) {
                        // 이미 B를 뽑은 상태라면 A를 뽑을 확률 0.5%씩 증가
                        probability += 0.005;
                    }
                    if (Math.random() <= probability) {
                        countA++;
                        break; // A를 두 번 뽑았으므로 종료
                    }
                }
            }
        }

        double probabilityA = (double) countA / totalTrials;
        System.out.println("A를 두 번 뽑을 확률: " + probabilityA);
    }

    public static double getProbability(int trial, boolean pickedB) {
        if (trial <= 44) {
            return 0.0075; // 초기 확률 0.75%
        } else if (trial <= 74) {
            if (pickedB) {
                return 0.0125; // 이미 B를 뽑은 상태에서는 A 뽑을 확률 1%
            } else {
                return 0.015; // B를 뽑은 후 A 뽑을 확률 1.5%
            }
        } else {
            return 0.0025 + (0.0025 * (trial - 74)); // 75번째부터는 A나 B 뽑을 확률 0.25%씩 증가
        }
    }
}

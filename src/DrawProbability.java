import java.util.Random;

public class DrawProbability {
    public static void main(String[] args) {
        int totalSimulations = 150;  // 총 시뮬레이션 횟수
        int targetCount = 2;  // 목표로 하는 A 뽑기 횟수
        int successCount = 0;  // 성공한 시뮬레이션 횟수

        // 시뮬레이션 반복
        for (int i = 0; i < totalSimulations; i++) {
            int drawCount = 0;  // 뽑기 횟수
            int aCount = 0;  // A 뽑기 횟수

            while (drawCount < 75 || (drawCount < 150 && aCount < targetCount)) {
                // 뽑기 실행
                if (drawCount >= 45) {
                    double currentProbability = 0.015 + ((drawCount - 44) * 0.005);
                    if (Math.random() < currentProbability) {
                        // 당첨 시 A 또는 B 뽑기
                        if (aCount < targetCount) {
                            aCount++;
                        } else {
                            aCount = 1;
                        }
                    }
                } else {
                    if (Math.random() < 0.015) {
                        // 당첨 시 A 또는 B 뽑기
                        if (aCount < targetCount) {
                            aCount++;
                        } else {
                            aCount = 1;
                        }
                    }
                }

                drawCount++;
            }

            // 목표 달성 시 성공한 시뮬레이션 횟수 증가
            if (aCount == targetCount) {
                successCount++;
            }
        }

        // 성공 확률 계산
        double successProbability = (double) successCount / totalSimulations;

        // 결과 출력
        System.out.println("A를 " + targetCount + "회 뽑을 확률: " + successProbability);
    }
}

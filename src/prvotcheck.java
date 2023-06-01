import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

public class prvotcheck {

    public static boolean containsDuplicate(int[] nums) {
        // HashSet을 사용하여 중복된 수를 확인합니다.
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            // 이미 set에 존재하는 경우 중복된 수가 있다고 판단합니다.
            if (set.contains(num)) {
                return true;
            }
            // set에 현재 수를 추가합니다.
            set.add(num);
        }
        // 중복된 수가 없는 경우 false를 반환합니다.
        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
        }

        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println("중복된 수가 있는지 확인 결과: " + hasDuplicates);
    }
}

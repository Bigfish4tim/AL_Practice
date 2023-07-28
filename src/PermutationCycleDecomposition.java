import java.util.ArrayList;
import java.util.Scanner;

class Cycle {
    ArrayList<Integer> elements;

    public Cycle() {
        elements = new ArrayList<>();
    }

    public void addElement(int element) {
        elements.add(element);
    }

    public void printCycle() {
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return elements.size();
    }
}

public class PermutationCycleDecomposition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("순열의 길이를 입력하세요: ");
        int n = scanner.nextInt();

        int[] permutation = new int[n+1];

        permutation[0] = 0;
        System.out.println("순열의 원소를 입력하세요 (공백으로 구분):");
        for (int i = 1; i < n+1; i++) {
            permutation[i] = scanner.nextInt();
        }

        ArrayList<Cycle> cycles = findCycles(permutation);
        System.out.println("순열을 사이클로 분할한 결과:");
        for (Cycle cycle : cycles) {
            cycle.printCycle();

        }
    }

    public static ArrayList<Cycle> findCycles(int[] permutation) {
        ArrayList<Cycle> cycles = new ArrayList<>();
        boolean[] visited = new boolean[permutation.length];

        for (int i = 1; i < permutation.length; i++) {
            if (!visited[i]) {
                Cycle cycle = new Cycle();
                int current = i;

                while (!visited[current]) {
                    visited[current] = true;
                    cycle.addElement(permutation[current]);
                    current = permutation[current];
                }

                if (cycle.getSize() > 1) {
                    cycles.add(cycle);
                }
            }
        }

        return cycles;
    }
}

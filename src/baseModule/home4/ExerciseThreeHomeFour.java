package home4;

import java.util.Scanner;

public class ExerciseThreeHomeFour {
    public static void main(String[] args) {
        int n, x, out = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        x = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                out = i + 1;
                continue;
            }
            if (arr[i] < x && arr[i + 1] > x) {
                out = i + 1;
            }
        }

        System.out.println(out);
    }
}

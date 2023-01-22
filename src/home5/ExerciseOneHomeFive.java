package home5;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseOneHomeFive {
    public static void main(String[] args) {
        int n, m, index = 0, min = 1000;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr = new int[n][m];
        int[] out = new int[n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            out[index++] = min;
            min = 1000;
        }

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }

    }
}

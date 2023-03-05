package home5;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseOneHomeFive {
    public static void main(String[] args) {
        int n, m, min = 1000;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr = new int[n][m];

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
            System.out.print(min + " ");
            min = 1000;
        }
    }
}

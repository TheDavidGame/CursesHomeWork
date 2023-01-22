package home5;

import java.util.Scanner;

public class ExerciseFiveHomeFive {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int sumOne = 0, sumTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {
                if (arr.length / 2 > i) {
                    sumOne += arr[i][i];
                } else if (arr.length / 2 < i) {
                    sumTwo += arr[i][i];
                }
            }
        }
        System.out.println(sumOne == sumTwo);
    }
}

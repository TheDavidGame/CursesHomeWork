package home5;

import java.util.Scanner;

public class ExerciseFourHomeFive {
    public static void main(String[] args) {
        int n, p, count = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        p = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == p) {
                    for (int k = 0; k < arr.length; k++) {
                        arr[i][k] = 0;
                    }
                    for (int k = 0; k < arr.length; k++) {
                        arr[k][j] = 0;
                    }
                }
            }
        }

        int j;

        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    count++;
                    continue;
                } else {
                    if (j == 2) {
                        System.out.print(arr[i][j] + "");
                    } else {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            if (count == j) {
                continue;
            } else {
                System.out.println();
            }
            count = 0;
        }
    }
}

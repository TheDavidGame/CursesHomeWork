package home5;

import java.util.Scanner;

public class ExerciseTwoHomeFive {
    public static void main(String[] args) {
        int n, x1, y1, x2, y2;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] arr = new int[n][n];

        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == y1 && j == x1) {
                    for (int k = j; k < x2 + 1; k++) {
                        arr[i][k] = 1;
                    }
                    for (int k = i; k < y2; k++) {
                        arr[k][j] = 1;
                    }
                }

                if (i == y2 && j == x2) {
                    for (int k = j; k > x1 - 1; k--) {
                        arr[i][k] = 1;
                    }
                    for (int k = i; k > y1; k--) {
                        arr[k][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == n - 1) {
                    System.out.print(arr[i][j] + "");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

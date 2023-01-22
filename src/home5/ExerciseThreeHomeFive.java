package home5;

import java.util.Scanner;

public class ExerciseThreeHomeFive {
    public static void main(String[] args) {
        int n, x, y;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        char[][] arr = new char[n][n];
        x = input.nextInt();
        y = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '0';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == y && j == x){
                    arr[i][j] = 'K';
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(Math.abs(y - i) * Math.abs(x - j) == 2){
                    arr[i][j] = 'X';
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

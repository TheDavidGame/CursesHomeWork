package home5;

import java.util.Scanner;

public class ExerciseSixHomeFive {
    public static void main(String[] args) {
        int n = 4;
        int[] normal = new int[n];
        int[][] arr = new int[7][4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < normal.length; i++) {
            normal[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        boolean check = false;
        for (int i = 0; i < arr[i].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            if (sum > normal[i]) {
                System.out.println("Нужно есть поменьше");
                check = true;
                break;
            }
            sum = 0;
        }
        if (!check)
            System.out.println("Отлично");
    }
}

package home4;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseTwoHomeFour {
    public static void main(String[] args) {
        int n, m;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        m = input.nextInt();
        int[] arr2 = new int[m];

        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = input.nextInt();
        }

        System.out.println(Arrays.equals(arr1, arr2));
    }
}

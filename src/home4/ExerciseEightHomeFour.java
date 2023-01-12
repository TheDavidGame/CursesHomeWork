package home4;

import java.util.Scanner;

public class ExerciseEightHomeFour {
    public static void main(String[] args) {
        int n, m, nearest = -1000, max = 1000;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        m = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                nearest = arr[i];
                break;
            } else {
                int temp = Math.abs(arr[i] - m);
                if (temp <= max) {
                    max = temp;
                    if(arr[i] > nearest){
                        nearest = arr[i];
                    }
                }
            }
        }
        System.out.println(nearest);
    }
}
